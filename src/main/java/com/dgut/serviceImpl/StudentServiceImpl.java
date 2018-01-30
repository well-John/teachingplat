package com.dgut.serviceImpl;


import com.dgut.dao.StudentMapper;
import com.dgut.entity.Student;
import com.dgut.entity.StudentExample;
import com.dgut.entity.StudentExample.Criteria;
import com.dgut.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl extends BaseServiceImpl<Student, StudentExample> implements StudentService{

	@Autowired
	private  StudentMapper studentMapper;
	
	
	@Autowired
	public void setBaseMapper(){
		super.setBaseMapper(studentMapper);
	}

	@Override
	public Student login(String email, String password) {
		StudentExample example=new StudentExample();
		Criteria criteria=example.createCriteria();
		criteria.andEmailEqualTo(email.trim());
		criteria.andPasswordEqualTo(password.trim());
		List<Student> list=studentMapper.selectByExample(example);
		if(list.size()==1){
			return list.get(0);
		}
		return null;
	}

	@Override
	public Integer register(Student student) {
		 studentMapper.insertSelective(student);
		 return student.getId();
	}

	@Override
	public boolean checkEmail(String email) {
		StudentExample example=new StudentExample();
		Criteria criteria=example.createCriteria();
		criteria.andEmailEqualTo(email.trim());
		return studentMapper.selectByExample(example).size()==0?true:false;
	}
}
