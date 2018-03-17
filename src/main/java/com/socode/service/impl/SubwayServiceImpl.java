package com.socode.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.socode.dao.SubwayDao;
import com.socode.entity.SubwayEntity;
import com.socode.service.SubwayService;



@Service("subwayService")
public class SubwayServiceImpl implements SubwayService {
	@Autowired
	private SubwayDao subwayDao;
	
	
	
}
