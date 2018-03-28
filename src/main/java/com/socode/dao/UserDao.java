package com.socode.dao;

import com.socode.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * 用户基本信息表
 * 
 * @author hotway
 * @email chenhuowei@outlook.com
 * @date 2018-03-10 16:03:28
 */
@Repository
public interface UserDao extends JpaRepository<UserEntity, Long>,JpaSpecificationExecutor<UserEntity> {
	
}
