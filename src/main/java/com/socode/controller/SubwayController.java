package com.socode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.socode.entity.SubwayEntity;
import com.socode.service.SubwayService;




/**
 * 
 * 
 * @author hotway
 * @email chenhuowei@outlook.com
 * @date 2018-03-10 16:03:28
 */
@Controller
public class SubwayController {
	@Autowired
	private SubwayService subwayService;
	
	
	
}
