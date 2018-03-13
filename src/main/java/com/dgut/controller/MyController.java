package com.dgut.controller;

import com.dgut.entity.Msg;
import com.dgut.entity.Student;
import com.dgut.entity.Teacher;
import com.dgut.service.AppointmentService;
import com.dgut.service.ForderService;
import com.dgut.service.PictureService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import javax.xml.ws.soap.Addressing;

/**
 * 用于页面跳转
 * @author Administrator
 *
 */

@Controller
public class MyController {

	private Logger logger = LoggerFactory.getLogger(MyController.class);

	@Autowired
	private ForderService forderService;

	@Autowired
	private AppointmentService appointmentService;

	@Autowired
	private PictureService pictureService;


	@RequestMapping("/my")
	public String forward(String url){
		logger.info("当前需要转发的url为："+url);
		return url;
	}

	@RequestMapping("/myhome")
	public String home(HttpSession session){
		Integer organiser = (Integer) session.getAttribute("identity");
		if(organiser == null){
			return "index";
		}else if(organiser == 1){
			return "student_home";
		}else{
			return "teacher_home";
		}
	}

	@RequestMapping("/addOrder")
	public String addOrder(HttpSession session){
		Integer organiser = (Integer) session.getAttribute("identity");
		if(organiser == null){
			return "index";
		}else if(organiser == 1){
			return "student_xuqiu";
		}else{
			return "index";
		}
	}


	@RequestMapping(value = "/checklogin", method = RequestMethod.POST)
	@ResponseBody
	public Msg checklogin(HttpSession session){
		Student student=(Student) session.getAttribute("student");
		Teacher teacher=(Teacher) session.getAttribute("teacher");
		Long forderCount;
		Long appointmentCount;
		if(student!=null){
			forderCount = forderService.countMyForder(student.getId(),1);
		    appointmentCount = appointmentService.countMyAppointment(student.getId(),1);
			return Msg.success("").add("type", 1).add("student", student).add("forderCount",forderCount)
					.add("appointmentCount",appointmentCount);
		}
		if(teacher!=null){
			Long cardCount = pictureService.selectMyCardPhoto(teacher.getId());
			Long lifePhotoCount = pictureService.selectMylifePhoto(teacher.getId());
			forderCount = forderService.countMyForder(teacher.getId(),2);
			appointmentCount = appointmentService.countMyAppointment(teacher.getId(),2);
			return Msg.success("").add("type", 2).add("teacher", teacher).add("forderCount",forderCount)
					.add("appointmentCount",appointmentCount).add("cardCount",cardCount)
					.add("lifePhotoCount",lifePhotoCount);
		}
		return Msg.error("");
	}

}
