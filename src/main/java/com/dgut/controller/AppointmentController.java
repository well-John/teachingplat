package com.dgut.controller;
import com.dgut.entity.Appointment;
import com.dgut.entity.Msg;
import com.dgut.entity.Student;
import com.dgut.entity.Teacher;
import com.dgut.service.AppointmentService;
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
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/appointment")
public class AppointmentController {

    private final Integer pageSize = 5;

    private Logger logger = LoggerFactory.getLogger(AppointmentController.class);

    @Autowired
    AppointmentService appointmentService;

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    @ResponseBody
    public Msg save(Appointment appointment) {
        if (appointmentService.insertSelective(appointment) == 1) {
            return Msg.success("");
        } else {
            return Msg.error("");
        }
    }


    @RequestMapping(value = "/selectAllAppointment",method = RequestMethod.POST)
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

    @RequestMapping(value = "/confirm",method = RequestMethod.POST)
    @ResponseBody
    public Msg confirmAppointMent(int id){
        logger.info("当前预约id为：{}",id);
        Appointment appointment = new Appointment();
        appointment.setId(id);
        appointment.setStatus(2);
        if(appointmentService.updateByPrimaryKeySelective(appointment) == 1){
            return Msg.success("");
        }
        return Msg.error("预约确认失败");
    }

}
