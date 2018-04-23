package com.dgut.controller;

import com.dgut.entity.*;
import com.dgut.service.AppointmentService;
import com.dgut.service.ForderService;
import com.dgut.service.TeacherRequirementService;
import com.dgut.service.TeacherService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/appointment")
public class AppointmentController {

    private static final Integer pageSize = 5;

    private Logger logger = LoggerFactory.getLogger(AppointmentController.class);

    @Autowired
    AppointmentService appointmentService;

    @Autowired
    ForderService forderService;

    @Autowired
    TeacherService teacherService;

    @Autowired
    TeacherRequirementService teacherRequirementService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public Msg save(Appointment appointment) {
        if (appointmentService.insertSelective(appointment) == 1) {
            return Msg.success("");
        } else {
            return Msg.error("");
        }
    }


    @RequestMapping(value = "/selectAllAppointment", method = RequestMethod.POST)
    @ResponseBody
    public Msg selectAllAppointment(HttpSession session, Integer organiser, Integer id, @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        //获取当前登录人的身份
        Integer identity = (Integer) session.getAttribute("identity");
        List<Appointment> list = new ArrayList<>();
        PageInfo<Appointment> pageInfo = null;

        //传id过来则直接查询，不用做判断
        if (id != 0) {
            list.add(appointmentService.selectByPrimaryKey(id));
            pageInfo = new PageInfo<>(list);
            return Msg.success("").add("pageInfo", pageInfo);
        }

        //如果登录人为学员
        if (identity == 1) {
            Student student = (Student) session.getAttribute("student");
            list = appointmentService.selectAllStudentAppointment(student.getId());

        } else if (identity == 2) {
            Teacher teacher = (Teacher) session.getAttribute("teacher");
            list = appointmentService.selectAllTeacherAppointment(teacher.getId());
        }

        if (list != null && !list.isEmpty()) {
            pageInfo = new PageInfo<>(list);
            return Msg.success("").add("pageInfo", pageInfo);
        }

        return Msg.error("");

    }

    @RequestMapping(value = "/confirm", method = RequestMethod.POST)
    @ResponseBody
    public Msg confirmAppointment(Integer id) {
        logger.info("当前预约id为：{}", id);
        if (appointmentService.checkStatus(id)) {
            return Msg.error("该预约记录已确认，请不要重复确认");
        }
        if (id == 2) {
            return Msg.error("该预约记录已经预约失败，无法操作");
        }
        Appointment appointment = new Appointment();
        appointment.setId(id);
        appointment.setStatus(1);
        List<Appointment> appointments = appointmentService.selectOtherFailAppointment(id);
        Teacher teacher = null;
        //查询该家教记录出其他未成功的教员，并把钱退回其账户,并且将其状态设为失败状态
        if (appointments != null && !appointments.isEmpty()) {
            for (Appointment appointment1 : appointments) {
                teacher = teacherService.selectByPrimaryKey(appointment1.getTeacherId());
                teacher.setBalance(teacher.getBalance().add(new BigDecimal(10)));
                teacherService.updateByPrimaryKeySelective(teacher);
                appointment1.setStatus(2);
                appointmentService.updateByPrimaryKeySelective(appointment1);
            }
        }

        if (appointmentService.updateByPrimaryKeySelective(appointment) == 1) {
            //学员确认后，生成未支付订单
            //1.先将家教单状态设为已关闭
            TeacherRequirement teacherRequirement = appointmentService.selectTeacherRequirementByAppointId(id);
            teacherRequirement.setReleaseStatus(3);
            teacherRequirementService.updateByPrimaryKeySelective(teacherRequirement);
            //2.生成未支付订单
            Appointment a = appointmentService.selectByPrimaryKey(id);
            Forder forder = new Forder();
            forder.setReleaseDate(new Date());
            forder.setAppointmentId(id);
            forder.setStatus(1);
            forder.setSubject(teacherRequirement.getSubject());
            forder.setTeacherRequirementId(teacherRequirement.getId());
            forder.setTeacherId(a.getTeacherId());
            forder.setStudentId(a.getStudentId());
            forderService.insertSelective(forder);
            return Msg.success("预约确认成功");
        }
        return Msg.error("预约确认失败");
    }


    //在线预约 供教员预约
    @RequestMapping("/applyAppointmentForTeacher")
    @ResponseBody
    public Msg applyAppointment(HttpSession session, Integer teacherRequirementId, Integer anotherId) {
        //先判断该家教单是否已被关闭
        if (teacherRequirementId != null && teacherRequirementService.checkClosed(teacherRequirementId)) {
                return Msg.error("该家教单已被关闭，无法预约！！！");
        }
        //获取当前登录人身份
        Integer organiser = (Integer) session.getAttribute("identity");
        if (organiser == null) {
            return Msg.error("请先登录！！！");
        } else if (organiser == 1) {
            return Msg.error("家教单只能由教员预约，学员无法预约");
        }
        Teacher teacher = (Teacher) session.getAttribute("teacher");
        //扣款
        if (teacher.getBalance().compareTo(new BigDecimal(10)) >= 0) {
            teacher.setBalance(teacher.getBalance().subtract(new BigDecimal(10)));
            teacherService.updateByPrimaryKeySelective(teacher);
        } else {
            return Msg.error("账户余额不足，请先充值！！！");
        }
        Appointment appointment = new Appointment();
        appointment.setTeacherId(teacher.getId());
        appointment.setTeacherConcat(teacher.getPhone());
        appointment.setStudentConcat(teacherRequirementService.selectByPrimaryKey(teacherRequirementId).getPhone());
        appointment.setTeacherName(teacher.getName());
        appointment.setStudentId(anotherId);
        appointment.setTeacherRequirementId(teacherRequirementId);
        appointment.setOrganiser(organiser);
        appointment.setAppointmentDate(new Date());
        appointmentService.insertSelective(appointment);
        return Msg.success("预约成功！！！");
    }
}
