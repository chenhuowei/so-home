package com.socode.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.socode.dao.HouseSubscribeDao;
import com.socode.entity.HouseSubscribeEntity;
import com.socode.service.HouseSubscribeService;



@Service("houseSubscribeService")
public class HouseSubscribeServiceImpl implements HouseSubscribeService {
	@Autowired
	private HouseSubscribeDao houseSubscribeDao;
	
	
	
}
