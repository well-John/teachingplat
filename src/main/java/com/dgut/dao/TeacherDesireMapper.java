package com.dgut.dao;

import com.dgut.bean.TeacherDesire;
import com.dgut.bean.TeacherDesireExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherDesireMapper extends BaseMapper<TeacherDesire, TeacherDesireExample>{
    long countByExample(TeacherDesireExample example);

    int deleteByExample(TeacherDesireExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TeacherDesire record);

    int insertSelective(TeacherDesire record);

    List<TeacherDesire> selectByExample(TeacherDesireExample example);

    TeacherDesire selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TeacherDesire record, @Param("example") TeacherDesireExample example);

    int updateByExample(@Param("record") TeacherDesire record, @Param("example") TeacherDesireExample example);

    int updateByPrimaryKeySelective(TeacherDesire record);

    int updateByPrimaryKey(TeacherDesire record);
}