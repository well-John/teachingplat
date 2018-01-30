package com.dgut.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用于页面跳转
 * @author Administrator
 *
 */

@Controller
public class MyController {
	
	@RequestMapping("/my")
	public String forward(String url){
		System.out.println("url:"+url);
		return url;
	}

}
