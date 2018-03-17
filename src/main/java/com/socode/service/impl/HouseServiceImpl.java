package com.socode.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.socode.dao.HouseDao;
import com.socode.service.HouseService;



@Service("houseService")
public class HouseServiceImpl implements HouseService {
	@Resource
	private HouseDao houseDao;
	
	
	
}
