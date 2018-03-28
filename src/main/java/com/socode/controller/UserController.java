package com.socode.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.socode.base.ApiResponse;
import com.socode.dto.PageDTO;
import com.socode.entity.UserEntity;
import com.socode.service.UserService;




/**
 * 用户基本信息表
 * 
 * @author hotway
 * @email chenhuowei@outlook.com
 * @date 2018-03-10 16:03:28
 */
@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("api/user/list")
	public ApiResponse listByPage(int page,int size) {
		PageDTO<UserEntity> pageDTO = new PageDTO<>();
		Page<UserEntity> pages = userService.listByPage(page,size);
		BeanUtils.copyProperties(pages, pageDTO);
		
		return ApiResponse.ofSuccess(pageDTO);
	}
	
	
}
