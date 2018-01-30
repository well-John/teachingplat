package com.dgut.service;

import java.util.List;

import com.dgut.entity.Forder;
import com.dgut.entity.ForderExample;

public interface ForderService extends BaseService<Forder, ForderExample> {

	List<Forder> selectMyForder(Integer id);

}
