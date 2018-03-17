package com.socode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.socode.entity.HouseEntity;
import com.socode.service.HouseService;




/**
 * 房屋信息表
 * 
 * @author hotway
 * @email chenhuowei@outlook.com
 * @date 2018-03-10 16:03:28
 */
@Controller
public class HouseController {
	@Autowired
	private HouseService houseService;
	
	
	
}
