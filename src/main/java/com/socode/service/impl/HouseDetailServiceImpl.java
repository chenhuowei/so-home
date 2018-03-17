package com.socode.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.socode.dao.HouseDetailDao;
import com.socode.entity.HouseDetailEntity;
import com.socode.service.HouseDetailService;



@Service("houseDetailService")
public class HouseDetailServiceImpl implements HouseDetailService {
	@Autowired
	private HouseDetailDao houseDetailDao;
	
	
	
}
