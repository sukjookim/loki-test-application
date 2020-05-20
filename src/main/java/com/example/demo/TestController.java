package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("/info")
	public String main() {
		Logger logger = LoggerFactory.getLogger(this.getClass());
		
		logger.info("info Level 테스트"); 

		return "hello";
	} 
	
	@RequestMapping("/debug")
	public String debug() {
		Logger logger = LoggerFactory.getLogger(this.getClass());
		
		logger.info("debug Level 테스트"); 

		return "hello";
	} 
	
	@RequestMapping("/err")
	public String error() {
		Logger logger = LoggerFactory.getLogger(this.getClass());
		
		logger.info("error Level 테스트"); 

		return "hello";
	} 
	
	@RequestMapping("/warn") 
	public String warn() {
		Logger logger = LoggerFactory.getLogger(this.getClass());
		
		logger.info("warn Level 테스트"); 

		return "hello";
	} 
	
}
 