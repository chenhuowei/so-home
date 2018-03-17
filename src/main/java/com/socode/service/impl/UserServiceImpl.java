package com.socode.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.socode.dao.UserDao;
import com.socode.entity.UserEntity;
import com.socode.service.UserService;



@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	
	
	
}
