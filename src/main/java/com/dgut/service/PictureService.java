package com.dgut.service;

import com.dgut.entity.Picture;
import com.dgut.entity.PictureExample;

import java.util.List;

public interface PictureService extends BaseService<Picture, PictureExample>{

    Long selectMyCardPhoto(Integer id);

    Long selectMylifePhoto(Integer id);

    List<Picture> selectTeacherPhotos(Integer teacherId);

    Integer delete(Integer id);
}
