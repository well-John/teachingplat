package com.dgut.service;

import com.dgut.entity.Student;
import com.dgut.entity.StudentExample;

public interface StudentService extends BaseService<Student, StudentExample> {

	//登录
	public Student login(String email, String password);
	//注册
	public Integer register(Student student);
	//检查邮箱是否可用
	public boolean checkEmail(String email);
}
