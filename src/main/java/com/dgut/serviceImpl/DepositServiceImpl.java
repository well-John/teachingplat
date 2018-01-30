package com.dgut.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dgut.entity.Deposit;
import com.dgut.entity.DepositExample;
import com.dgut.entity.DepositExample.Criteria;
import com.dgut.dao.DepositMapper;
import com.dgut.service.DepositService;
@Service
public class DepositServiceImpl extends BaseServiceImpl<Deposit, DepositExample> implements DepositService{

	
	@Autowired
	DepositMapper depositMapper;

	@Autowired
	public void setBaseMapper() {
		super.setBaseMapper(depositMapper);
	}

	@Override
	public List<Deposit> selectAllDeposit(Integer organiser, Integer id) {
		DepositExample example=new DepositExample();
		Criteria criteria=example.createCriteria();
		criteria.andOrganiserEqualTo(organiser);
		criteria.andOrganiserIdEqualTo(id);
		return depositMapper.selectByExample(example);
	}
	
	
}
