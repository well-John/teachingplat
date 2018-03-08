package com.dgut.service;

import com.dgut.entity.Appointment;
import com.dgut.entity.AppointmentExample;
import com.dgut.entity.TeacherRequirement;

import java.util.List;

public interface AppointmentService extends BaseService<Appointment, AppointmentExample> {
	//根据发起人和学生id查询该学生的所有预约信息
	List<Appointment> selectAllStudentAppointment(int organiser, Integer id);
	//根据发起人和教员id查询该老师的所有预约信息
	List<Appointment> selectAllTeacherAppointment(int organiser, Integer id);
	//确认预约记录是否已确认
    boolean checkStatus(Integer id);
	//根据预约id来获取家教信息
    TeacherRequirement selectTeacherRequirementByAppointId(Integer id);
}
