package com.dgut.service;

import com.dgut.entity.Teacher;
import com.dgut.entity.TeacherExample;

import java.util.List;

public interface TeacherService extends BaseService<Teacher, TeacherExample> {

	public Teacher login(String email, String password);
	
	public Integer register(Teacher teacher);
	
	public List<Teacher> selectTeachersByExample(String subject, String university, String area, Integer identity, Integer sex,Integer isverify);

	public boolean checkPhone(String phone);

	public boolean checkEmail(String email);

	public String selectTeacherNameById(Integer id);

	public List<Teacher> recommendTeacher(Integer id);

}
