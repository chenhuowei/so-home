package com.socode.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.socode.dao.SubwayStationDao;
import com.socode.entity.SubwayStationEntity;
import com.socode.service.SubwayStationService;



@Service("subwayStationService")
public class SubwayStationServiceImpl implements SubwayStationService {
	@Autowired
	private SubwayStationDao subwayStationDao;
	
	
	
}
