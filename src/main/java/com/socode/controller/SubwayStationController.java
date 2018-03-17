package com.socode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.socode.entity.SubwayStationEntity;
import com.socode.service.SubwayStationService;




/**
 * 
 * 
 * @author hotway
 * @email chenhuowei@outlook.com
 * @date 2018-03-10 16:03:28
 */
@Controller
public class SubwayStationController {
	@Autowired
	private SubwayStationService subwayStationService;
	
	
	
}
