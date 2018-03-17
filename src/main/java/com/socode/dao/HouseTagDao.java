package com.socode.dao;

import com.socode.entity.HouseTagEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 房屋标签映射关系表
 * 
 * @author hotway
 * @email chenhuowei@outlook.com
 * @date 2018-03-10 16:03:28
 */
public interface HouseTagDao extends JpaRepository<HouseTagEntity, Integer> {
	
}
