package com.dgut.controller;

import com.dgut.entity.Msg;
import com.dgut.entity.Teacher;
import com.dgut.service.TeacherService;
import com.dgut.utils.IPAddressUtil;
import com.dgut.utils.MD5Util;
import com.dgut.utils.SendMailUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/teacher")
@Slf4j
public class TeacherController {

    private static final String TEACHER = "teacher";

    private static final String STUDENT = "student";

    private static final String IDENTITY = "identity"; //当前身份 1 学员，2 教员

    private final static Integer PAGESIZE = 5;

    @Autowired
    TeacherService teacherService;

    @RequestMapping("/login")
    @ResponseBody
    public Msg login(HttpServletRequest request, String email, String password) {
        Teacher teacher;
        HttpSession session = request.getSession();
        log.info("当前请求ip为：{}", request.getRemoteAddr());
        if ((teacher = teacherService.login(email, MD5Util.encode(password.trim()))) != null) {
            if (teacher.getIsabled() == 0) {
                return Msg.error("您的邮箱还没有经过验证");
            } else if (teacher.getIsabled() == 1) {
                return Msg.error("您的账户已被禁用！！！");
            } else {
                teacher.setLoginTimes((teacher.getLoginTimes() == null ? 0 : teacher.getLoginTimes()) + 1);
                teacher.setLastTime(new Date());
                teacher.setLastIp(IPAddressUtil.getIpAdrress(request));
                teacherService.updateByPrimaryKeySelective(teacher);
                session.removeAttribute(STUDENT);
                session.setAttribute(TEACHER, teacher);
                session.setAttribute(IDENTITY, 2);
                return Msg.success("登录成功");
            }
        }
        return Msg.error("登录失败");
    }

    @RequestMapping("/register")
    @ResponseBody
    public Msg register(HttpServletRequest request, Teacher teacher, String pcode) {
        // 获取验证码
        teacher.setRegisterTime(new Date());
        String code = (String) request.getSession().getAttribute("RANDOM_CODE_KEY");
        if (!code.equals(pcode.trim())) {
            return Msg.error("验证码错误");
        }
        teacher.setAvatar("tx_0.jpg");
        teacher.setPassword(MD5Util.encode(teacher.getPassword()));

        if (teacherService.register(teacher) != 0) {
            String checkcode = MD5Util.generateCheckcode(teacher.getEmail(), teacher.getName());
            request.getSession().removeAttribute("RANDOM_CODE_KEY");
            request.getSession().setAttribute("checkcode", checkcode);
            log.info("发送参数：email：{}，id：{}，organiser:{},checkcode:{}", teacher.getEmail(), teacher.getId(), 2, checkcode);
            SendMailUtil.send(teacher.getEmail(), teacher.getId(), 2, checkcode);
            return Msg.success("注册成功");
        }
        return Msg.error("注册失败");
    }

    @RequestMapping("selectAllTeacher")
    @ResponseBody
    public Msg selectAllTeacher(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum, String
            subject, String university, String area, Integer identity, Integer sex, Integer isverify) {
        PageHelper.startPage(pageNum, PAGESIZE);
        List<Teacher> list = teacherService.selectTeachersByExample(subject, university, area, identity, sex, isverify);
        if (list != null && !list.isEmpty()) {
            PageInfo<Teacher> pageInfo = new PageInfo<>(list);
            return Msg.success("").add("pageInfo", pageInfo);
        }
        return Msg.error("");
    }

    @RequestMapping("selectTeacherInfo")
    @ResponseBody
    public Msg selectTeacherById(@RequestParam(value = "id", required = true) Integer id) {
        Teacher teacher = teacherService.selectByPrimaryKey(id);
        if (teacher == null) {
            log.info("所查询的教师信息不存在！！！  id:{0}", id);
            return Msg.error("所查询的教师信息不存在！！！");
        }
        return Msg.success("").add(TEACHER, teacher);
    }

    @RequestMapping("/checkEmail")
    @ResponseBody
    public Msg checkEmail(String email) {
        if (teacherService.checkEmail(email.trim())) {
            return Msg.success("");
        }
        return Msg.error("");
    }

    @RequestMapping("/index")
    public String index() {
        return "redirect:/my?url=teacher_home";
    }

    @RequestMapping("/getInfo")
    @ResponseBody
    public Msg getTeacherInfo(HttpSession session, Integer id) {
        Teacher teacher = null;
        if (id != null) {
            teacher = teacherService.selectByPrimaryKey(id);
            return Msg.success("").add(TEACHER, teacher);
        }
        if ((teacher = (Teacher) session.getAttribute(TEACHER)) != null) {
            return Msg.success("").add(TEACHER, teacher);
        }
        return Msg.error("");
    }

    @RequestMapping(value = "/updateInfo", method = RequestMethod.POST)
    @ResponseBody
    public Msg updateTeacherInfo(Teacher teacher) {
        if (teacherService.updateByPrimaryKeySelective(teacher) == 1) {
            return Msg.success("");
        } else {
            return Msg.error("");
        }
    }

    @RequestMapping(value = "/changePass", method = RequestMethod.POST)
    @ResponseBody
    public Msg updatePassword(HttpSession session, String password) {
        Teacher teacher = (Teacher) session.getAttribute(TEACHER);
        teacher.setPassword(MD5Util.encode(password.trim()));
        if (teacherService.updateByPrimaryKeySelective(teacher) == 1) {
            return Msg.success("更新密码成功");
        } else {
            return Msg.error("更新密码失败");
        }
    }

    @RequestMapping("/selectRecommendTeacher")
    @ResponseBody
    public Msg selectRecommendTeacher(Integer id) {
        List<Teacher> list = teacherService.recommendTeacher(id);
        return Msg.success("").add("list", list);
    }
}
