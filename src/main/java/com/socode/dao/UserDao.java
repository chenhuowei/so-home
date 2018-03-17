package com.socode.dao;

import com.socode.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 用户基本信息表
 * 
 * @author hotway
 * @email chenhuowei@outlook.com
 * @date 2018-03-10 16:03:28
 */
public interface UserDao extends JpaRepository<UserEntity, Integer> {
	
}
