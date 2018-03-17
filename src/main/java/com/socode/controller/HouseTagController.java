package com.socode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.socode.entity.HouseTagEntity;
import com.socode.service.HouseTagService;




/**
 * 房屋标签映射关系表
 * 
 * @author hotway
 * @email chenhuowei@outlook.com
 * @date 2018-03-10 16:03:28
 */
@Controller
public class HouseTagController {
	@Autowired
	private HouseTagService houseTagService;
	
	
	
}
