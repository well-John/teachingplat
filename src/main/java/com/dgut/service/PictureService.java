package com.dgut.service;

import com.dgut.entity.Picture;
import com.dgut.entity.PictureExample;

public interface PictureService extends BaseService<Picture, PictureExample>{

    Long selectMyCardPhoto(Integer id);

    Long selectMylifePhoto(Integer id);
}
