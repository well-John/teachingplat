package com.dgut.controller;






import com.dgut.entity.Appointment;
import com.dgut.entity.Msg;
import com.dgut.entity.Student;
import com.dgut.entity.Teacher;
import com.dgut.service.AppointmentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/appointment")
public class AppointmentController {

    private final Integer pageSize = 5;

    @Autowired
    AppointmentService appointmentService;

    @RequestMapping("/save")
    @ResponseBody
    public Msg save(Appointment appointment) {
        if (appointmentService.insertSelective(appointment) == 1) {
            return Msg.success("");
        } else {
            return Msg.error("");
        }
    }


    @RequestMapping("/selectAllAppointment")
    @ResponseBody
    public Msg selectAllAppointment(HttpSession session, int organiser, @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        //获取当前登录人的身份
        Integer identity = (Integer) session.getAttribute("identity");
        List<Appointment> list = new ArrayList<>();
        PageInfo<Appointment> pageInfo = null;
        //如果登录人为学员
        if (identity == 1) {
            Student student = (Student) session.getAttribute("student");
            list = appointmentService.selectAllStudentAppointment(organiser, student.getId());

        } else if (identity == 2) {
            Teacher teacher = (Teacher) session.getAttribute("teacher");
            list = appointmentService.selectAllTeacherAppointment(organiser, teacher.getId());
        }

        if (list != null && list.size() != 0) {
            pageInfo = new PageInfo<>(list);
            return Msg.success("").add("pageInfo", pageInfo);
        }

        return Msg.error("");

    }


}
