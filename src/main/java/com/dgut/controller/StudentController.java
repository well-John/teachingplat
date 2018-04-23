package com.dgut.controller;

import com.dgut.entity.Msg;
import com.dgut.entity.Student;
import com.dgut.service.StudentService;
import com.dgut.utils.IPAddressUtil;
import com.dgut.utils.MD5Util;
import com.dgut.utils.RandomValidateCode;
import com.dgut.utils.SendMailUtil;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;


@Api
@Controller
@Slf4j
public class StudentController {

    private static final String TEACHER = "teacher";

    private static final String STUDENT = "student";

    private static final String RANDOM_CODE_KEY = "RANDOM_CODE_KEY";//验证码

    private static final String IDENTITY = "identity"; //当前身份 0 学员，1 教员

    private static final String CHECKCODE = "checkcode"; //邮箱checkCode校验，md5(用户邮箱+用户名)

    @Autowired
    StudentService studentService;

    @Autowired
    RandomValidateCode randomValidateCode;


    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    @ResponseBody
    public void logout(HttpSession session) {
        Integer identity = (Integer) session.getAttribute(IDENTITY);
        if (identity == null)
            return;
        if (identity.equals(1)) {
            session.removeAttribute(STUDENT);
        } else {
            session.removeAttribute(TEACHER);
        }
    }


    @RequestMapping("/student/login")
    @ResponseBody
    public Msg login(HttpServletRequest request, String email, String password) {
        Student student;
        HttpSession session = request.getSession();
        if ((student = studentService.login(email, MD5Util.encode(password.trim()))) != null) {
            if (student.getIsabled() == 0) {
                return Msg.error("您的邮箱还没有经过验证");
            } else if (student.getIsabled() == 1) {
                return Msg.error("您的账户已被禁用！！！");
            } else {
                student.setLoginTimes((student.getLoginTimes() == null ? 0 : student.getLoginTimes()) + 1);
                student.setLastTime(new Date());
                student.setLastIp(IPAddressUtil.getIpAdrress(request));
                studentService.updateByPrimaryKeySelective(student);
                session.removeAttribute(TEACHER);
                session.setAttribute(STUDENT, student);
                session.setAttribute(IDENTITY, 1);
                return Msg.success("登陆成功");
            }
        } else {
            return Msg.error("登录失败,请检查您的密码和邮箱是否正确");
        }

    }

    @RequestMapping(value = "/student/register", method = RequestMethod.POST)
    @ResponseBody
    public Msg register(HttpServletRequest request, Student student, String pcode) {
        // 获取验证码
        String code = (String) request.getSession().getAttribute(RANDOM_CODE_KEY);
        if (!code.equals(pcode)) {
            return Msg.error("验证码错误");
        }
        student.setPassword(MD5Util.encode(student.getPassword()));
        Integer id = studentService.register(student);
        if (id != null) {
            String checkcode = MD5Util.generateCheckcode(student.getEmail(), student.getName());
            request.getSession().removeAttribute(RANDOM_CODE_KEY);
            request.getSession().setAttribute(CHECKCODE, checkcode);
            log.info("发送参数：email：{}，id：{}，organiser:{},checkcode:{}", student.getEmail(), student.getId(), 2, checkcode);
            SendMailUtil.send(student.getEmail(), student.getId(), 1, checkcode);
            return Msg.success("注册成功").add("id", id);
        }
        return Msg.error("注册失败");
    }

    @RequestMapping("/pcode")
    public void pcode(HttpServletRequest request, HttpServletResponse response) {
        randomValidateCode.getRandcode(request, response);
    }

    @ResponseBody
    @RequestMapping("/docode")
    public Msg doLogin(HttpServletRequest request, HttpServletResponse response, @RequestParam String pcode) {
        // 获取验证码
        String code = (String) request.getSession().getAttribute(RANDOM_CODE_KEY);
        request.getSession().removeAttribute(RANDOM_CODE_KEY);
        if (code.equals(pcode)) {
            return null;
        } else {
            return Msg.error("验证码错误");
        }

    }

    @RequestMapping("/GetStudentInformation")
    @ResponseBody
    public Msg GetStudentInfomation(HttpSession session) {
        Student student = (Student) session.getAttribute(STUDENT);
        if (student != null) {
            Student student2 = studentService.selectByPrimaryKey(student.getId());
            session.setAttribute(STUDENT, student2);
            return Msg.success("").add(STUDENT, student2);
        }
        return Msg.error("");

    }

    @RequestMapping("/student/getInfo")
    @ResponseBody
    public Msg getStudentInfo(HttpSession session) {
        Student student = null;
        if ((student = (Student) session.getAttribute(STUDENT)) != null) {
            return Msg.success("").add(STUDENT, student);
        }
        return Msg.error("");
    }

    @RequestMapping("/student/UpdateInformation")
    @ResponseBody
    public Msg UpdateInfomation(HttpSession session, Student student) {
        Student student2 = (Student) session.getAttribute(STUDENT);
        student.setId(student2.getId());
        if (studentService.updateByPrimaryKeySelective(student) == 1) {
            return Msg.success("");
        }

        return Msg.error("");

    }

    @RequestMapping("/student/changePass")
    @ResponseBody
    public Msg changePass(HttpSession session, String password) {
        Student student = (Student) session.getAttribute(STUDENT);
        student.setPassword(MD5Util.encode(password));
        if (studentService.updateByPrimaryKeySelective(student) == 1) {
            session.setAttribute(STUDENT, student);
            return Msg.success("修改密码成功");
        }
        return Msg.error("修改密码失败");
    }

    @RequestMapping("/student/index")
    public String Index() {
        return "redirect:/my?url=student_home";
    }


}
