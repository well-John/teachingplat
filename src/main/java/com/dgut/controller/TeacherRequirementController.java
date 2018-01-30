package com.dgut.controller;

import com.dgut.entity.*;
import com.dgut.service.ForderService;
import com.dgut.service.StudentService;
import com.dgut.service.TeacherRequirementService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/teacherRequirement")
public class TeacherRequirementController {
	
	private final Integer pageSize=5;
	
	@Autowired
	TeacherRequirementService teacherRequirementService;
	
	@Autowired
	StudentService studentService;
	
	@Autowired
	ForderService forderService;
	
	/**
	 * 学员注册时发布的
	 * @param teacherRequirement
	 * @return
	 */
	@RequestMapping("/register")
	@ResponseBody
	public Msg register(TeacherRequirement teacherRequirement){
		System.out.println(teacherRequirement);
		if(teacherRequirementService.insertSelective(teacherRequirement)==1){
			Forder forder=new Forder();
			forder.setReleaseDate(new Date());
			forder.setStatus(0);
			forder.setStudentId(teacherRequirement.getStudentId());
			forder.setSubject(teacherRequirement.getSubject());
			forderService.insertSelective(forder);
			return Msg.success("success");
		}
		return Msg.error("发布家教信息失败");
	}
	
	/**
	 * 发布家教信息
	 * @param teacherRequirement
	 * @return
	 */
	@RequestMapping("/save")
	@ResponseBody
	public Msg save(HttpSession session ,TeacherRequirement teacherRequirement){
		System.out.println(teacherRequirement);
		Student student=(Student) session.getAttribute("student");
		teacherRequirement.setStudentId(student.getId());
		if(teacherRequirementService.insertSelective(teacherRequirement)==1){
			Forder forder=new Forder();
			forder.setReleaseDate(new Date());
			forder.setStatus(0);
			forder.setStudentId(student.getId());
			forder.setSubject(teacherRequirement.getSubject());
			forderService.insertSelective(forder);
			return Msg.success("success");
		}
		return Msg.error("发布家教信息失败");
	}
	//学员库中查询的家教信息
	@RequestMapping("/selectAllTeacherRequire")
	@ResponseBody
	public Msg selectAllTeacherRequire(@RequestParam(value="pageNum",defaultValue="1")Integer pageNum,String area,String grade,Integer sex,Integer identity,String subject){
		PageHelper.startPage(pageNum, pageSize);
		List<TeacherRequirement> list=teacherRequirementService.selecTeacherRequirementsByExample(area, grade, sex, identity, subject);
		if(!list.isEmpty()&&list.size()!=0){
			PageInfo<TeacherRequirement> pageInfo=new PageInfo<>(list);
			return Msg.success("").add("pageInfo", pageInfo);
		}
		return Msg.error("");
	}
	
	@RequestMapping("/selectTeacherRequirement")
	@ResponseBody
	public Msg selectTeacherRequirement(Integer id){
		TeacherRequirement teacherRequirement=teacherRequirementService.selectByPrimaryKey(id);
		if(teacherRequirement!=null){
			Student student=studentService.selectByPrimaryKey(teacherRequirement.getStudentId());
			return Msg.success("").add("req", teacherRequirement).add("student", student);
		}
		return Msg.error("");
	}
}
