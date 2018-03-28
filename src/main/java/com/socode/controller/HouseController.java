package com.socode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.socode.entity.HouseEntity;
import com.socode.service.HouseService;




/**
 * 房屋信息表
 * 
 * @author hotway
 * @email chenhuowei@outlook.com
 * @date 2018-03-10 16:03:28
 */
@RestController
@RequestMapping("api/house")
public class HouseController {
	@Autowired
	private HouseService houseService;
	
	@GetMapping("list")
	public Page<HouseEntity> listByPage(int page,int size){
		
		return houseService.listByPage(page, size);
	}
	
	
	
	
}
