package com.socode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.socode.entity.HouseSubscribeEntity;
import com.socode.service.HouseSubscribeService;




/**
 * 预约看房信息表
 * 
 * @author hotway
 * @email chenhuowei@outlook.com
 * @date 2018-03-10 16:03:28
 */
@Controller
public class HouseSubscribeController {
	@Autowired
	private HouseSubscribeService houseSubscribeService;
	
	
	
}
