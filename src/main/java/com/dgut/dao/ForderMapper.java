package com.dgut.dao;

import com.dgut.entity.Forder;
import com.dgut.entity.ForderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ForderMapper extends BaseMapper<Forder, ForderExample> {
    long countByExample(ForderExample example);

    int deleteByExample(ForderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Forder record);

    int insertSelective(Forder record);

    List<Forder> selectByExample(ForderExample example);

    Forder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Forder record, @Param("example") ForderExample example);

    int updateByExample(@Param("record") Forder record, @Param("example") ForderExample example);

    int updateByPrimaryKeySelective(Forder record);

    int updateByPrimaryKey(Forder record);
}