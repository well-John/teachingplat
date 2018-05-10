package com.dgut.serviceImpl;

import com.dgut.entity.Picture;
import com.dgut.entity.PictureExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dgut.dao.PictureMapper;
import com.dgut.service.PictureService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PictureServiceImpl extends BaseServiceImpl<Picture, PictureExample> implements PictureService {

    @Autowired
    PictureMapper pictureMapper;

    @Autowired
    public void setBaseMapper() {
        super.setBaseMapper(pictureMapper);
    }

    @Override
    public Long selectMyCardPhoto(Integer id) {
        PictureExample example = new PictureExample();
        PictureExample.Criteria criteria = example.createCriteria();
        List<Integer> list = Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6});
        criteria.andTeacherIdEqualTo(id);
        criteria.andDeleteStatusEqualTo(0);
        criteria.andTypeIn(list);
        return pictureMapper.countByExample(example);
    }

    @Override
    public Long selectMylifePhoto(Integer id) {
        PictureExample example = new PictureExample();
        PictureExample.Criteria criteria = example.createCriteria();
        List<Integer> list = Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6});
        criteria.andDeleteStatusEqualTo(0);
        criteria.andTeacherIdEqualTo(id);
        criteria.andTypeNotIn(list);
        return pictureMapper.countByExample(example);
    }

    @Override
    public List<Picture> selectTeacherPhotos(Integer teacherId) {
        PictureExample example = new PictureExample();
        PictureExample.Criteria criteria = example.createCriteria();
        criteria.andTeacherIdEqualTo(teacherId);
        criteria.andDeleteStatusEqualTo(0);
        return pictureMapper.selectByExample(example);
    }

    @Override
    public Integer delete(Integer id) {
        Picture picture = new Picture();
        picture.setId(id);
        picture.setDeleteStatus(1);
        return pictureMapper.updateByPrimaryKeySelective(picture);
    }
}
