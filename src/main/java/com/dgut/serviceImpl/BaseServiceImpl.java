package com.dgut.serviceImpl;

import java.util.List;

import com.dgut.dao.BaseMapper;
import com.dgut.service.BaseService;


public abstract class BaseServiceImpl<T,Example> implements BaseService<T, Example> {

	private BaseMapper<T, Example> baseMapper;
	
	
	public void setBaseMapper(BaseMapper<T, Example> baseMapper) {
		this.baseMapper=baseMapper;
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return baseMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(T record) {
		return baseMapper.insert(record);
	}

	@Override
	public int insertSelective(T record) {
		return baseMapper.insertSelective(record);
	}

	@Override
	public T selectByPrimaryKey(Integer id) {
		return baseMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(T record) {
		return baseMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(T record) {
		return baseMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<T> selectByExample(Example example) {
		return baseMapper.selectByExample(example);
	}

	@Override
	public long countByExample(Example example) {
		
		return baseMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(Example example) {
		return baseMapper.deleteByExample(example);
	}

	@Override
	public int updateByExampleSelective(T record, Example example) {
		return baseMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(T t, Example example) {
		return baseMapper.updateByExample(t, example);
	}
	@Override
	public List<T> selectAll(){
		return baseMapper.selectByExample(null);
	}
}
