package com.dgut.service;

import com.dgut.entity.Appointment;
import com.dgut.entity.AppointmentExample;
import com.dgut.entity.TeacherRequirement;

import java.util.List;

public interface AppointmentService extends BaseService<Appointment, AppointmentExample> {
	//根据学生id查询该学生的所有预约信息
	List<Appointment> selectAllStudentAppointment(Integer id);
	//根据教员id查询该老师的所有预约信息
	List<Appointment> selectAllTeacherAppointment(Integer id);
	//确认预约记录是否已确认
    boolean checkStatus(Integer id);
	//根据预约id来获取家教信息
    TeacherRequirement selectTeacherRequirementByAppointId(Integer id);
    //查询我的预约记录数量
    Long countMyAppointment(Integer id,Integer identity);
}
