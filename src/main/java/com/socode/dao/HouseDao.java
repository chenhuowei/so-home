package com.socode.dao;

import com.socode.entity.HouseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 房屋信息表
 * 
 * @author hotway
 * @email chenhuowei@outlook.com
 * @date 2018-03-10 16:03:28
 */
public interface HouseDao extends JpaRepository<HouseEntity, Integer> {
	
}
