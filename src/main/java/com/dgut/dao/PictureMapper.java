package com.dgut.dao;

import com.dgut.bean.Picture;
import com.dgut.bean.PictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PictureMapper extends BaseMapper<Picture, PictureExample>{
    long countByExample(PictureExample example);

    int deleteByExample(PictureExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Picture record);

    int insertSelective(Picture record);

    List<Picture> selectByExample(PictureExample example);

    Picture selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Picture record, @Param("example") PictureExample example);

    int updateByExample(@Param("record") Picture record, @Param("example") PictureExample example);

    int updateByPrimaryKeySelective(Picture record);

    int updateByPrimaryKey(Picture record);
}