package com.socode.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.socode.dao.HousePictureDao;
import com.socode.entity.HousePictureEntity;
import com.socode.service.HousePictureService;



@Service("housePictureService")
public class HousePictureServiceImpl implements HousePictureService {
	@Autowired
	private HousePictureDao housePictureDao;
	
	
	
}
