package com.dgut.service;

import com.dgut.entity.Forder;
import com.dgut.entity.ForderExample;

import java.util.List;

public interface ForderService extends BaseService<Forder, ForderExample> {

	List<Forder> selectMyForder(Integer id, Integer identity, Integer status);
	//查询我的订单数量
	Long countMyForder(Integer id,Integer identity);

}
