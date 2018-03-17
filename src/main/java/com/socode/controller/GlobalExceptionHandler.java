package com.socode.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;

@ControllerAdvice
public class GlobalExceptionHandler {

	/**
     * 应用到所有@RequestMapping注解方法，在其执行之前初始化数据绑定器
     * @param binder
     */
    @InitBinder
    public void initBinder(WebDataBinder binder) {}

   
	
	/**
     * 系统异常处理，比如：404,500
     * @param req
     * @param resp
     * @param e
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value = Exception.class)
    public String defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        if (e instanceof org.springframework.web.servlet.NoHandlerFoundException) {
             return "redirect:404.html";
        } else {
        	return "redirect:500.html";
             
        }
        
    }
	
}
