package com.dgut.serviceImpl;

import com.dgut.dao.TeacherRequirementMapper;
import com.dgut.entity.TeacherRequirement;
import com.dgut.entity.TeacherRequirementExample;
import com.dgut.service.TeacherRequirementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherRequirementServiceImpl extends BaseServiceImpl<TeacherRequirement, TeacherRequirementExample> implements TeacherRequirementService {

    @Autowired
    TeacherRequirementMapper teacherRequirementMapper;

    @Autowired
    public void setBaseMapper() {
        super.setBaseMapper(teacherRequirementMapper);
    }

    @Override
    public List<TeacherRequirement> selectTeacherRequirementsByExample(String area, String grade, Integer sex, Integer identity, String subject, Integer studentId) {
        TeacherRequirementExample example = new TeacherRequirementExample();
        example.setOrderByClause("release_time desc");
        TeacherRequirementExample.Criteria criteria = example.createCriteria();

        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(2);
        //只显示发布中和已关闭的家教单
        criteria.andReleaseStatusNotIn(list);
        if (area != null && !area.isEmpty()) {
            criteria.andAreaEqualTo(area.trim());
        }
        if (grade != null && !grade.isEmpty()) {
            criteria.andGradeEqualTo(grade.trim());
        }
        if (sex != null) {
            criteria.andRequireSexEqualTo(sex);
        }
        if (identity != null) {
            criteria.andIdentityEqualTo(identity);
        }
        if (subject != null && !subject.isEmpty()) {
            criteria.andSubjectLike("%" + subject.trim() + "%");
        }
        if (studentId != null) {
            criteria.andStudentIdEqualTo(studentId);
        }
        return teacherRequirementMapper.selectByExample(example);
    }

    @Override
    public List<TeacherRequirement> selectTeacherRequirementByStudentId(Integer studentId) {
        TeacherRequirementExample example = new TeacherRequirementExample();
        example.setOrderByClause("release_time desc");
        TeacherRequirementExample.Criteria criteria = example.createCriteria();
        criteria.andStudentIdEqualTo(studentId);
        //只查发布中的家教信息
        criteria.andReleaseStatusEqualTo(1);
        return teacherRequirementMapper.selectByExample(example);
    }

    @Override
    public boolean checkClosed(Integer teacherRequirementId) {
        return teacherRequirementMapper.selectByPrimaryKey(teacherRequirementId).getReleaseStatus() == 3 ? true : false;
    }

    @Override
    public List<TeacherRequirement> recommendTeacherRequirement(Integer id) {
        TeacherRequirementExample example = new TeacherRequirementExample();
        example.setOrderByClause("release_time desc");
        TeacherRequirement teacherRequirement = teacherRequirementMapper.selectByPrimaryKey(id);
        TeacherRequirementExample.Criteria criteria = example.createCriteria();
        criteria.andIdNotEqualTo(teacherRequirement.getId());
        if (teacherRequirement.getSubject() != null) {
            criteria.andSubjectLike("%" + teacherRequirement.getSubject().trim() + "%");
        }
        if (teacherRequirement.getArea() != null) {
            criteria.andAreaLike("%" + teacherRequirement.getArea().trim() + "%");
        }
        if (teacherRequirement.getRequireSex() != null) {
            criteria.andRequireSexEqualTo(teacherRequirement.getRequireSex());
        }
        List<TeacherRequirement> teacherRequirements = teacherRequirementMapper.selectByExample(example);
        if (teacherRequirements.size() == 0) {
            teacherRequirements = teacherRequirementMapper.selectTop3(id);
        }
        return teacherRequirements;
    }

}
