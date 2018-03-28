package com.socode.service;

import org.springframework.data.domain.Page;

import com.socode.entity.HouseEntity;


/**
 * 房屋信息表
 * 
 * @author hotway
 * @email chenhuowei@outlook.com
 * @date 2018-03-10 16:03:28
 */
public interface HouseService {
	
	public Page<HouseEntity> listByPage(int page,int size);
}
