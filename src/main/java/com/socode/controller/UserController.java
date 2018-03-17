package com.socode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.socode.entity.UserEntity;
import com.socode.service.UserService;




/**
 * 用户基本信息表
 * 
 * @author hotway
 * @email chenhuowei@outlook.com
 * @date 2018-03-10 16:03:28
 */
@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	
	
}
