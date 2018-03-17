package com.socode.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.socode.dao.RoleDao;
import com.socode.entity.RoleEntity;
import com.socode.service.RoleService;



@Service("roleService")
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleDao roleDao;
	
	
	
}
