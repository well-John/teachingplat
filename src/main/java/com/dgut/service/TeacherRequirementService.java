package com.dgut.service;

import com.dgut.entity.TeacherRequirement;
import com.dgut.entity.TeacherRequirementExample;

import java.util.List;

public interface TeacherRequirementService extends BaseService<TeacherRequirement,TeacherRequirementExample> {

    public List<TeacherRequirement> selecTeacherRequirementsByExample(String area, String grade, Integer sex, Integer identity, String subject);
}
