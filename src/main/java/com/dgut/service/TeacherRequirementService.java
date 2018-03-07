package com.dgut.service;

import com.dgut.entity.TeacherRequirement;
import com.dgut.entity.TeacherRequirementExample;

import java.util.List;

public interface TeacherRequirementService extends BaseService<TeacherRequirement,TeacherRequirementExample> {

    public List<TeacherRequirement> selectTeacherRequirementsByExample(String area, String grade, Integer sex, Integer identity, String subject, Integer studentId);

    List<TeacherRequirement> selectTeacherRequirementByStudentId(Integer studentId);

    boolean checkClosed(Integer teacherRequirementId);
}
