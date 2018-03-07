package com.dgut.controller;

import com.dgut.entity.Favorite;
import com.dgut.entity.Msg;
import com.dgut.entity.Student;
import com.dgut.entity.Teacher;
import com.dgut.service.FavoriteService;
import com.dgut.service.TeacherService;
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

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class FavoriteController {

	private Logger logger = LoggerFactory.getLogger(FavoriteController.class);

	private final Integer pageSize=5;

	@Autowired
	FavoriteService favoriteService;

	@Autowired
	TeacherService teacherService;
	
	@RequestMapping(value = "selectAllFavorite",method = RequestMethod.POST)
	@ResponseBody
	public Msg selectAllFavorite(HttpSession session,@RequestParam(value="pageNum",defaultValue="1")Integer pageNum){
		Student student=(Student) session.getAttribute("student");
		PageHelper.startPage(pageNum, pageSize);
		List<Favorite> list =favoriteService.selectAllFavorite(student.getId());
		if(list.size()!=0&&list!=null){
			PageInfo<Favorite> pageInfo=new PageInfo<>(list);
			return Msg.success("").add("pageInfo", pageInfo);
		}
		return Msg.error("");
	}

	@RequestMapping(value = "favorite/addFavorite",method = RequestMethod.POST)
	@ResponseBody
	public Msg addFavorite(HttpSession session,Integer teacherId){
		 Integer identity = (Integer) session.getAttribute("identity");
		logger.info("当前身份为：{}",identity);
		 if(identity != 1){
		 	return Msg.error("该操作仅为学员使用");
		 }

        Favorite favorite = new Favorite();
		Student student = (Student) session.getAttribute("student");
	    if(favoriteService.checkExist(student.getId(),teacherId)){
	    	return Msg.error("该教员已经被收藏，不能重复收藏！！！");
		}
		favorite.setStudentId(student.getId());
		Teacher teacher = teacherService.selectByPrimaryKey(teacherId);
		favorite.setName(teacher.getName());
		favorite.setEducation(teacher.getEducation());
		favorite.setSchoolMajor(teacher.getUniversity()+teacher.getMajor());
		favorite.setSex(teacher.getSex());
		favorite.setSubject(teacher.getTeachingSubject());
		favorite.setTeacherId(teacherId);
		if(favoriteService.insertSelective(favorite) == 1){
			return Msg.success("收藏教员成功");
		}else{
			logger.error("插入favorite记录失败;当前参数为:{}",favorite.toString());
			return Msg.error("收藏教员失败");
		}
	}

	@RequestMapping(value = "favorite/cancelFavorite")
	@ResponseBody
	public Msg cancelFavorite(Integer id){
		if(favoriteService.deleteByPrimaryKey(id) == 1){
			return Msg.success("");
		}else {
			return Msg.error("");
		}
	}

}
