package com.dgut.service;

import java.util.List;

import com.dgut.entity.Deposit;
import com.dgut.entity.DepositExample;

public interface DepositService extends BaseService<Deposit, DepositExample>{

	//根据充值人身份和充值人id查询所有的充值记录
	List<Deposit> selectAllDeposit(Integer organiser, Integer id);

}
