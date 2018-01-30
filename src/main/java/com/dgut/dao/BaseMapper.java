package com.dgut.dao;

import java.util.List;

public interface BaseMapper<T,Example> {

	long countByExample(Example example);

	int deleteByExample(Example example);

	int deleteByPrimaryKey(Integer id);
	
    List<T> selectByExample(Example example);

	int insert(T t);

	int insertSelective(T t);

	T selectByPrimaryKey(Integer id);
	
	int updateByExampleSelective(T record, Example example);

	int updateByExample(T t, Example example);

	int updateByPrimaryKeySelective(T t);

	int updateByPrimaryKey(T t);
	
	List<T> selectAll();
}
