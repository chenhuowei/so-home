package com.socode.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.socode.dao.HouseTagDao;
import com.socode.entity.HouseTagEntity;
import com.socode.service.HouseTagService;



@Service("houseTagService")
public class HouseTagServiceImpl implements HouseTagService {
	@Autowired
	private HouseTagDao houseTagDao;
	
	
	
}
