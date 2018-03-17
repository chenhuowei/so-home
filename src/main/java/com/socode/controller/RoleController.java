package com.socode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.socode.entity.RoleEntity;
import com.socode.service.RoleService;




/**
 * 用户角色表
 * 
 * @author hotway
 * @email chenhuowei@outlook.com
 * @date 2018-03-10 16:03:28
 */
@Controller
public class RoleController {
	@Autowired
	private RoleService roleService;
	
	
	
}
