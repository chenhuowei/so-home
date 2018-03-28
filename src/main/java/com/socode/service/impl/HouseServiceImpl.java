package com.socode.service.impl;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.socode.dao.HouseDao;
import com.socode.entity.HouseEntity;
import com.socode.service.HouseService;



@Service("houseService")
public class HouseServiceImpl implements HouseService {
	@Resource
	private HouseDao houseDao;

	@Override
	public Page<HouseEntity> listByPage(int page, int size) {
		return houseDao.findAll(PageRequest.of(page, size));
	}
	
	
	
}
