package com.socode.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("admin")
public class IndexController {

	@GetMapping("index.html")
	public ModelAndView indexPage() {
		
		ModelAndView mv = new ModelAndView("admin/index");
		
		return mv;
	}
	
	@GetMapping("404.html")
	public ModelAndView notfoundPage() {
		
		ModelAndView mv = new ModelAndView("404");
		
		return mv;
	}
	
	@GetMapping("500.html")
	public ModelAndView exceptionPage() {
		
		ModelAndView mv = new ModelAndView("500");
		
		return mv;
	}
	
	
	
	
}
