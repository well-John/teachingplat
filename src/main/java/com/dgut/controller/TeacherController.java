package com.dgut.controller;

import com.dgut.entity.*;
import com.dgut.service.TeacherService;
import com.dgut.utils.IPAddressUtil;
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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

    private Logger logger = LoggerFactory.getLogger(TeacherController.class);

    private final static Integer PAGESIZE = 5;

    @Autowired
    TeacherService teacherService;

    @RequestMapping("/login")
    @ResponseBody
    public Msg login(HttpServletRequest request, String email, String password) {
        Teacher teacher;
        HttpSession session = request.getSession();
        logger.info("当前请求ip为：{}",request.getRemoteAddr());
        if ((teacher = teacherService.login(email, password)) != null) {
            if (teacher.getIsabled() == 0) {
                return Msg.error("您的邮箱还没有经过验证");
            } else if (teacher.getIsabled() == 1) {
                return Msg.error("您的账户已被禁用！！！");
            } else {
                teacher.setLoginTimes((teacher.getLoginTimes()==null?0:teacher.getLoginTimes()) + 1);
                teacher.setLastTime(new Date());
                teacher.setLastIp(IPAddressUtil.getIpAdrress(request));
                session.removeAttribute("student");
                session.setAttribute("teacher", teacher);
                session.setAttribute("identity", 2);
                return Msg.success("登录成功");
            }
        }
        return Msg.error("登录失败");
    }

        @RequestMapping("/register")
        @ResponseBody
        public Msg register (HttpServletRequest request, Teacher teacher, String pcode){
            // 获取验证码
            teacher.setRegisterTime(new Date());
            String code = (String) request.getSession().getAttribute("RANDOM_CODE_KEY");
            if (!code.equals(pcode.trim())) {
                return Msg.error("验证码错误");
            }
            if (teacherService.register(teacher) == 1) {
                request.getSession().removeAttribute("RANDOM_CODE_KEY");
                return Msg.success("注册成功");
            }
            return Msg.error("注册失败");
        }

        @RequestMapping("selectAllTeacher")
        @ResponseBody
        public Msg selectAllTeacher (@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum, String
        subject, String university, String area, Integer identity, Integer sex,Integer isverify){
            System.out.println("subject=" + subject + " university=" + university + " area=" + area + " identity=" + identity + " sex=" + sex);
            PageHelper.startPage(pageNum, PAGESIZE);
            List<Teacher> list = teacherService.selectTeachersByExample(subject, university, area, identity, sex,isverify);
            System.out.println("list:" + list);
            if (list != null && !list.isEmpty()) {
                PageInfo<Teacher> pageInfo = new PageInfo<>(list);
                return Msg.success("").add("pageInfo", pageInfo);
            }
            return Msg.error("");
        }

        @RequestMapping("selectTeacherInfo")
        @ResponseBody
        public Msg selectTeacherById (@RequestParam(value = "id", required = true) Integer id){
            Teacher teacher = teacherService.selectByPrimaryKey(id);
            if (teacher == null) {
                logger.info("所查询的教师信息不存在！！！  id:{0}", id);
                return Msg.error("所查询的教师信息不存在！！！");
            }
            return Msg.success("").add("teacher", teacher);
        }

        @RequestMapping("/checkEmail")
        @ResponseBody
        public Msg checkEmail (String email){
            if (teacherService.checkEmail(email.trim())) {
                return Msg.success("");
            }
            return Msg.error("");
        }

        @RequestMapping("/index")
        public String index () {
            return "redirect:/my?url=teacher_home";
        }

        @RequestMapping("/getInfo")
        @ResponseBody
        public Msg getTeacherInfo (HttpSession session,Integer id){
            Teacher teacher = null;
            if(id != null){
                teacher = teacherService.selectByPrimaryKey(id);
                return Msg.success("").add("teacher",teacher);
            }
            if ((teacher = (Teacher) session.getAttribute("teacher")) != null) {
                return Msg.success("").add("teacher", teacher);
            }
            return Msg.error("");
        }

        @RequestMapping(value = "/updateInfo",method = RequestMethod.POST)
        @ResponseBody
        public Msg updateTeacherInfo(Teacher teacher){
            if(teacherService.updateByPrimaryKeySelective(teacher)==1){
                return Msg.success("");
            }else{
                return Msg.error("");
            }
        }

        @RequestMapping(value = "/changePass",method = RequestMethod.POST)
        @ResponseBody
        public Msg updatePassword(HttpSession session,String password){
            Teacher teacher = (Teacher) session.getAttribute("teacher");
            teacher.setPassword(password.trim());
            if(teacherService.updateByPrimaryKeySelective(teacher)==1){
                return Msg.success("更新密码成功");
            }else{
                return Msg.error("更新密码失败");
            }
        }

        @RequestMapping("/selectRecommendTeacher")
        @ResponseBody
        public Msg selectRecommendTeacher(Integer id){
            List<Teacher> list  = teacherService.recommendTeacher(id);
            return Msg.success("").add("list",list);
        }
    }
