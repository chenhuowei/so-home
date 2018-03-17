package com.socode.dao;

import com.socode.entity.SubwayStationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 
 * 
 * @author hotway
 * @email chenhuowei@outlook.com
 * @date 2018-03-10 16:03:28
 */
public interface SubwayStationDao extends JpaRepository<SubwayStationEntity, Integer> {
	
}
