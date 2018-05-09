package com.dgut.controller;

import com.dgut.entity.Msg;
import com.dgut.entity.Student;
import com.dgut.entity.Teacher;
import com.dgut.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * 用于页面跳转
 *
 * @author Administrator
 */

@Controller
@Slf4j
public class MyController {

    private static final String TEACHER = "teacher";

    private static final String STUDENT = "student";

    private static final String IDENTITY = "identity"; //当前身份 0 学员，1 教员

    private static final String CHECKCODE = "checkcode"; //邮箱checkCode校验，md5(用户邮箱+用户名)


    @Autowired
    private StudentService studentService;

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private ForderService forderService;

    @Autowired
    private AppointmentService appointmentService;

    @Autowired
    private PictureService pictureService;


    @RequestMapping("/my")
    public String forward(String url) {
        log.info("当前需要转发的url为：" + url);
        return url;
    }

    @RequestMapping("/myhome")
    public String home(HttpSession session) {
        Integer organiser = (Integer) session.getAttribute(IDENTITY);
        if (organiser == null) {
            return "index";
        } else if (organiser == 1) {
            return "student_home";
        } else {
            return "teacher_home";
        }
    }

    @RequestMapping("/addOrder")
    public String addOrder(HttpSession session) {
        Integer organiser = (Integer) session.getAttribute(IDENTITY);
        if (organiser == null) {
            return "index";
        } else if (organiser == 1) {
            return "student_xuqiu";
        } else {
            return "index";
        }
    }


    @RequestMapping(value = "/checklogin", method = RequestMethod.POST)
    @ResponseBody
    public Msg checklogin(HttpSession session) {
        Student student = (Student) session.getAttribute(STUDENT);
        Teacher teacher = (Teacher) session.getAttribute(TEACHER);
        Long forderCount;
        Long appointmentCount;
        if (student != null) {
            forderCount = forderService.countMyForder(student.getId(), 1);
            appointmentCount = appointmentService.countMyAppointment(student.getId(), 1);
            return Msg.success("").add("type", 1).add("student", student).add("forderCount", forderCount)
                    .add("appointmentCount", appointmentCount);
        }
        if (teacher != null) {
            Long cardCount = pictureService.selectMyCardPhoto(teacher.getId());
            Long lifePhotoCount = pictureService.selectMylifePhoto(teacher.getId());
            forderCount = forderService.countMyForder(teacher.getId(), 2);
            appointmentCount = appointmentService.countMyAppointment(teacher.getId(), 2);
            return Msg.success("").add("type", 2).add("teacher", teacher).add("forderCount", forderCount)
                    .add("appointmentCount", appointmentCount).add("cardCount", cardCount)
                    .add("lifePhotoCount", lifePhotoCount);
        }
        return Msg.error("");
    }

    @RequestMapping(value = "/getBalance", method = RequestMethod.POST)
    @ResponseBody
    public Msg getBalance(HttpSession session) {
        Integer organiser = (Integer) session.getAttribute(IDENTITY);
        if (organiser == null) {
            return Msg.error("");
        } else if (organiser == 1) {
            Student student = (Student) session.getAttribute(STUDENT);
            return Msg.success("").add("organiser", organiser).add("amount", student.getBalance());
        } else {
            Teacher teacher = (Teacher) session.getAttribute("teacher");
            return Msg.success("").add("organiser", organiser).add("amount", teacher.getBalance());
        }
    }

    @RequestMapping("/email/activate")
    public String active(Integer id, Integer organiser, String checkcode, HttpSession session) {
        String code = (String) session.getAttribute(CHECKCODE);
        if (code != null) {
            if (code.equals(checkcode)) {
                if (organiser == 1) {
                    Student student = new Student();
                    student.setId(id);
                    student.setIsabled(2);
                    studentService.updateByPrimaryKeySelective(student);
                    session.removeAttribute(CHECKCODE);
                    log.info("激活成功——————————————————");
                    return "redirect:/my?url=index";
                } else if (organiser == 2) {
                    Teacher teacher = new Teacher();
                    teacher.setId(id);
                    teacher.setIsabled(2);
                    teacherService.updateByPrimaryKeySelective(teacher);
                    session.removeAttribute(CHECKCODE);
                    log.info("激活成功——————————————————");
                    return "redirect:/my?url=index";
                }
            }

        }
        log.info("激活失败——————————————————");
        return "redirect:/my?url=index";
    }

}
