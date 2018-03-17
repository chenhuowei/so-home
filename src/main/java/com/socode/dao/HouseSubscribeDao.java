package com.socode.dao;

import com.socode.entity.HouseSubscribeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 预约看房信息表
 * 
 * @author hotway
 * @email chenhuowei@outlook.com
 * @date 2018-03-10 16:03:28
 */
public interface HouseSubscribeDao extends JpaRepository<HouseSubscribeEntity, Integer> {
	
}
