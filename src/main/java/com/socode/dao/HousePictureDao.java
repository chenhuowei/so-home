package com.socode.dao;

import com.socode.entity.HousePictureEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 房屋图片信息
 * 
 * @author hotway
 * @email chenhuowei@outlook.com
 * @date 2018-03-10 16:03:28
 */
public interface HousePictureDao extends JpaRepository<HousePictureEntity, Integer> {
	
}
