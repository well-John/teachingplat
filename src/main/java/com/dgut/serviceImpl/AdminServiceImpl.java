package com.dgut.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dgut.entity.Admin;
import com.dgut.entity.AdminExample;
import com.dgut.dao.AdminMapper;
import com.dgut.service.AdminService;

@Service
public class AdminServiceImpl extends BaseServiceImpl<Admin, AdminExample> implements AdminService{

	@Autowired
	AdminMapper adminMapper;
	
	@Autowired
	public void setBaseMapper() {
		super.setBaseMapper(adminMapper);
	}

}
