package com.dgut.service;

import java.util.List;

import com.dgut.dao.BaseMapper;

public interface BaseService<T, Example> {

	long countByExample(Example example);
	
	int deleteByExample(Example example);
	
	int deleteByPrimaryKey(Integer id);

	int insert(T record);

	int insertSelective(T record);

	T selectByPrimaryKey(Integer id);
	
	List<T> selectByExample(Example example);

	int updateByPrimaryKeySelective(T record);
	
	int updateByPrimaryKey(T record);
	
	int updateByExampleSelective(T record, Example example);
	
	int updateByExample(T t, Example example);
	
	List<T> selectAll();

	void setBaseMapper();

}
