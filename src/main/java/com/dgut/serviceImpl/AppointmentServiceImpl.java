package com.dgut.serviceImpl;

import java.util.List;

import com.dgut.dao.TeacherRequirementMapper;
import com.dgut.entity.TeacherRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dgut.entity.Appointment;
import com.dgut.entity.AppointmentExample;
import com.dgut.entity.AppointmentExample.Criteria;
import com.dgut.dao.AppointmentMapper;
import com.dgut.service.AppointmentService;

@Service
public class AppointmentServiceImpl extends BaseServiceImpl<Appointment, AppointmentExample> implements AppointmentService {

	@Autowired
	AppointmentMapper appointmentMapper;

	@Autowired
	TeacherRequirementMapper teacherRequirementMapper;
	
	@Autowired
	public void setBaseMapper() {
		super.setBaseMapper(appointmentMapper);
	}

	@Override
	public List<Appointment> selectAllStudentAppointment(int organiser, Integer id) {
		AppointmentExample example=new AppointmentExample();
		Criteria criteria=example.createCriteria();
		criteria.andOrganiserEqualTo(organiser);
		criteria.andStudentIdEqualTo(id);
		return appointmentMapper.selectByExample(example);
	}

	@Override
	public List<Appointment> selectAllTeacherAppointment(int organiser, Integer id) {
		AppointmentExample example=new AppointmentExample();
		Criteria criteria=example.createCriteria();
		criteria.andOrganiserEqualTo(organiser);
		criteria.andTeacherIdEqualTo(id);
		return appointmentMapper.selectByExample(example);
	}

	@Override
	public boolean checkStatus(Integer id) {
		return appointmentMapper.selectByPrimaryKey(id).getStatus()==1?true:false;
	}

	@Override
	public TeacherRequirement selectTeacherRequirementByAppointId(Integer id) {
		return teacherRequirementMapper.selectByPrimaryKey(appointmentMapper.selectByPrimaryKey(id).getTeacherRequirementId());
	}

}
