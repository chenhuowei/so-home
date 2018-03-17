package com.socode.dao;

import com.socode.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 用户角色表
 * 
 * @author hotway
 * @email chenhuowei@outlook.com
 * @date 2018-03-10 16:03:28
 */
public interface RoleDao extends JpaRepository<RoleEntity, Integer> {
	
}
