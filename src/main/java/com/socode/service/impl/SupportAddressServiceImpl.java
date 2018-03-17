package com.socode.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.socode.dao.SupportAddressDao;
import com.socode.entity.SupportAddressEntity;
import com.socode.service.SupportAddressService;



@Service("supportAddressService")
public class SupportAddressServiceImpl implements SupportAddressService {
	@Autowired
	private SupportAddressDao supportAddressDao;
	
	
	
}
