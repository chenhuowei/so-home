package com.socode.service;



import java.util.List;

import org.springframework.data.domain.Page;

import com.socode.entity.UserEntity;


/**
 * 用户基本信息表
 * 
 * @author hotway
 * @email chenhuowei@outlook.com
 * @date 2018-03-10 16:03:28
 */
public interface UserService {
	/**
	 * 分页获取用户
	 * @param page
	 * @param limit
	 * @return
	 */
	public Page<UserEntity> listByPage(int page,int size);
}
