package com.dgut.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * 用于页面跳转
 * @author Administrator
 *
 */

@Controller
public class MyController {

	private Logger logger = LoggerFactory.getLogger(MyController.class);

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

}
