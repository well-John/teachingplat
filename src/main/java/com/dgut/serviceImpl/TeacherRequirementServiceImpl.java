package com.dgut.serviceImpl;

import com.dgut.dao.TeacherRequirementMapper;
import com.dgut.entity.TeacherRequirement;
import com.dgut.entity.TeacherRequirementExample;
import com.dgut.service.TeacherRequirementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public List<TeacherRequirement> selecTeacherRequirementsByExample(String area, String grade, Integer sex, Integer identity, String subject) {
		TeacherRequirementExample example=new TeacherRequirementExample();
		TeacherRequirementExample.Criteria criteria=example.createCriteria();
		if(area!=null&&!area.isEmpty()){
			criteria.andAreaEqualTo(area.trim());
		}
		if(grade!=null&&!grade.isEmpty()){
			criteria.andGradeEqualTo(grade.trim());
		}
		if(sex!=null){
			criteria.andRequireSexEqualTo(sex);
		}if(identity!=null){
			criteria.andIdentityEqualTo(identity);
		}
		if(subject!=null&&!subject.isEmpty()){
			criteria.andSubjectLike("%"+subject.trim()+"%");
		}
		
		return teacherRequirementMapper.selectByExample(example);
	}

}
