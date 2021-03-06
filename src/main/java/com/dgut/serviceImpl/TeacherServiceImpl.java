package com.dgut.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dgut.entity.Teacher;
import com.dgut.entity.TeacherExample;
import com.dgut.entity.TeacherExample.Criteria;
import com.dgut.dao.TeacherMapper;
import com.dgut.service.TeacherService;

@Service
public class TeacherServiceImpl extends BaseServiceImpl<Teacher, TeacherExample> implements TeacherService {

    @Autowired
    TeacherMapper teacherMapper;

    @Autowired
    public void setBaseMapper() {
        super.setBaseMapper(teacherMapper);
    }


    @Override
    public Teacher login(String email, String password) {
        TeacherExample example = new TeacherExample();
        Criteria criteria = example.createCriteria();
        criteria.andEmailEqualTo(email);
        criteria.andPasswordEqualTo(password);
        List<Teacher> list = teacherMapper.selectByExample(example);
        if (list.size() == 1) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public Integer register(Teacher teacher) {

        return teacherMapper.insertSelective(teacher);
    }


    @Override
    public List<Teacher> selectTeachersByExample(String subject, String university, String area, Integer identity, Integer sex, Integer isverify) {
        TeacherExample example = new TeacherExample();
        example.setOrderByClause("last_time desc");
        Criteria criteria = example.createCriteria();
        if (isverify == 2) {
            criteria.andIsverifyEqualTo(isverify);
        }
        if (subject != null && !subject.equals("")) {
            criteria.andTeachingSubjectLike("%" + subject.trim() + "%");
        }
        if (university != null && !university.equals("")) {
            criteria.andUniversityEqualTo(university.trim());
        }
        if (area != null && !area.equals("")) {
            criteria.andTeachingAreaLike("%" + area.trim() + "%");
        }
        if (identity != null && !identity.equals("")) {
            criteria.andIdentityEqualTo(identity);
        }
        if (sex != null && !sex.equals("")) {
            criteria.andSexEqualTo(sex);
        }
        return teacherMapper.selectByExample(example);
    }

    public boolean checkPhone(String phone) {
        return teacherMapper.checkPhone(phone) != 0 ? true : false;
    }

    public boolean checkEmail(String email) {
        return teacherMapper.checkEmail(email) != 0 ? true : false;
    }

    @Override
    public String selectTeacherNameById(Integer id) {
        return teacherMapper.selectTeacherNameById(id);
    }

    @Override
    public List<Teacher> recommendTeacher(Integer id) {
        Teacher teacher = teacherMapper.selectByPrimaryKey(id);
        TeacherExample example = new TeacherExample();
        example.setOrderByClause("last_time desc");
        Criteria criteria = example.createCriteria();
        criteria.andIdNotEqualTo(id);
        if (teacher.getUniversity() != null) {
            criteria.andUniversityEqualTo(teacher.getUniversity().trim());
        }
        if (teacher.getTeachingArea() != null)
            criteria.andTeachingAreaLike(teacher.getTeachingArea());
        List<Teacher> teachers = teacherMapper.selectByExample(example);
        if (teachers.isEmpty()) {
            teachers = teacherMapper.selectTop8(id);
        }
        return teachers;
    }

}
