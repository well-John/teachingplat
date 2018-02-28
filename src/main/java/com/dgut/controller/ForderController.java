package com.dgut.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dgut.entity.*;
import com.dgut.service.ForderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class ForderController {

	private Logger logger = LoggerFactory.getLogger(ForderController.class);
	
	private final Integer pageSize=5;
	
	@Autowired
	ForderService forderService;


	//根据identity来确定当前的登录用户的身份,通用查询订单
	@RequestMapping(value = "/selectMyForder",method = RequestMethod.POST)
	@ResponseBody
	public Msg selectMyForder(HttpServletRequest request, @RequestParam(value="pageNum",defaultValue="1")Integer pageNum ){
		HttpSession session = request.getSession();
		Integer identity = (Integer) session.getAttribute("identity");
		List<Forder> list = null;
		if(identity == 1){
			Student student=(Student) session.getAttribute("student");
			PageHelper.startPage(pageNum, pageSize);
			list= forderService.selectMyForder(student.getId(),identity);
		}else{
			Teacher teacher = (Teacher) session.getAttribute("teacher");
			PageHelper.startPage(pageNum, pageSize);
			list= forderService.selectMyForder(teacher.getId(),identity);
		}

		if(list!=null&&!list.isEmpty()){
			PageInfo<Forder> pageInfo=new PageInfo<>(list);
			return Msg.success("").add("pageInfo", pageInfo);
		}
		return Msg.error("");
	
	}
	
	@RequestMapping(value = "/selectAllForders",method = RequestMethod.POST)
	@ResponseBody
	public Msg selectAllForders(@RequestParam(value="pageNum",defaultValue="1")Integer pageNum){
		PageHelper.startPage(pageNum, pageSize);
		List<Forder> list=forderService.selectAll();
		if(list!=null&&!list.isEmpty()){
			PageInfo<Forder> pageInfo=new PageInfo<>(list);
			return Msg.success("").add("pageInfo", pageInfo);
		}
		return Msg.error("");
	}

	@RequestMapping(value = "/forderComplete",method = RequestMethod.POST)
	@ResponseBody
	public Msg complete(Integer id){
		Forder forder = new Forder();
		forder.setId(id);
		forder.setStatus(3);
		forderService.updateByPrimaryKeySelective(forder);
		return Msg.success("");
	}

	

}
