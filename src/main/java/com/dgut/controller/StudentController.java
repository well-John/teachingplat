package com.dgut.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dgut.entity.*;
import com.dgut.utils.RandomValidateCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.dgut.service.StudentService;
import com.dgut.service.TeacherService;


@Controller
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@Autowired
	TeacherService teacherService;

	@Autowired
	RandomValidateCode randomValidateCode;
	
	
	@RequestMapping("/checklogin")
	@ResponseBody
	public Msg checklogin(HttpSession session){
		Student student=(Student) session.getAttribute("student");
		Teacher teacher=(Teacher) session.getAttribute("teacher");
		if(student!=null){
			return Msg.success("").add("type", 1).add("student", student);
		}
		if(teacher!=null){
			return Msg.success("").add("type", 2).add("teacher", teacher);
		}
		return Msg.error("");
	}

	@RequestMapping("/logout")
	public String logout(HttpSession session){
		Integer identity=(Integer) session.getAttribute("identity");
		System.out.println("------identity-------:"+identity);
		if((Integer)session.getAttribute("identity")==1){
			Student student=(Student) session.getAttribute("student");
			if(student!=null){
				studentService.updateByPrimaryKeySelective(student);
			}
			session.removeAttribute("student");
		}else{
			session.removeAttribute("teacher");
		}
		return "index";
	}
	
	
	
	@RequestMapping("/student/login")
	@ResponseBody
	public Msg login(HttpSession session, String email, String password) {
		Student student;
		if ((student = studentService.login(email, password)) != null) {
			if (student.getIsabled() == 0) {
				return Msg.error("您的邮箱还没有经过验证");
			} else if (student.getIsabled() == 1) {
				return Msg.error("您的账户已被禁用！！！");
			} else {
				student.setLoginTimes(student.getLoginTimes()+1);
				session.removeAttribute("teacher");
				session.setAttribute("student", student);
				session.setAttribute("identity", 1);
				System.out.println("student:"+student);
				return Msg.success("登陆成功");
			}
		} else {
			return Msg.error("登录失败,请检查您的密码和邮箱是否正确");
		}

	}

	@RequestMapping("/student/register")
	@ResponseBody
	public Msg register(HttpServletRequest request,Student student,String pcode) {
		// 获取验证码
		String code = (String) request.getSession().getAttribute("RANDOM_CODE_KEY");
		if(!code.equals(pcode)){
			return Msg.error("验证码错误");
		}
		Integer id=studentService.register(student);
		if (id!=null) {
			request.getSession().removeAttribute("RANDOM_CODE_KEY");
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
		String code = (String) request.getSession().getAttribute("RANDOM_CODE_KEY");
		request.getSession().removeAttribute("RANDOM_CODE_KEY");
		if (code.equals(pcode)) {
			return null;
		} else {
			return Msg.error("验证码错误");
		}

	}
	
	@RequestMapping("/GetStudentInformation")
	@ResponseBody
	public Msg GetStudentInfomation(HttpSession session){
		Student student=(Student) session.getAttribute("student");
		if(student!=null){
			Student student2=studentService.selectByPrimaryKey(student.getId());
			session.setAttribute("student", student2);
			return Msg.success("").add("student", student2);
		}
		return Msg.error("");
		
	}
	
	@RequestMapping("/student/getInfo")
	@ResponseBody
	public Msg getStudentInfo(HttpSession session){
		Student student=null;
		if((student=(Student) session.getAttribute("student"))!=null){
			return Msg.success("").add("student", student);
		}
		return Msg.error("");
	}
	
	@RequestMapping("/student/UpdateInformation")
	@ResponseBody
	public Msg UpdateInfomation(HttpSession session,Student student){
		Student student2=(Student) session.getAttribute("student");
		student.setId(student2.getId());
		System.out.println("student:"+student);
		if(studentService.updateByPrimaryKeySelective(student)==1){
			return Msg.success("");
		}
		
		return Msg.error("");
		
	}
	@RequestMapping("/student/changePass")
	@ResponseBody
	public Msg changePass(HttpSession session,String password){
		System.out.println("password:"+password);
		Student student=(Student) session.getAttribute("student");
		student.setPassword(password);
		if(studentService.updateByPrimaryKeySelective(student)==1){
			session.setAttribute("student", student);
			return Msg.success("修改密码成功");
		}
		return Msg.error("修改密码失败");
	}
	
	@RequestMapping("/student/index")
	public String Index(){
		return "redirect:/my?url=student_home";
	}
}
