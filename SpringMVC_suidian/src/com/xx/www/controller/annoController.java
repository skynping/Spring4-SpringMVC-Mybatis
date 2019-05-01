package com.xx.www.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*	常用注解
 * 	RequestParam:获取参数
 * 	RequestBody：获取请求体
 * 	PathVariable：绑定url中的占位符
 * 	RequestHeader:获得请求头信息
 * 	CookieValue: 获得cook值
 *  ModelAttribute: 作用在方法上，会先于控制方法执行
 *  SessionAttribute
 * */
@Controller
@RequestMapping("/jsp")
public class annoController {
	
	// RequestParam将传入的name的值赋值给username
	@RequestMapping("/anno/testRequestParam")
	public String testRequestParam(@RequestParam(name="name") String username) {
		System.out.println("username:" + username);
		return "hello";
	}
	
	@RequestMapping("/anno/testPathVariable/{sid}")
	public String testPathVariable(@PathVariable("sid") String id) {
		System.out.println("id:" + id);
		return "hello";
	}
	
	@RequestMapping("/anno/testModelAttribute")
	public String testModelAttribute(@ModelAttribute("va") String value) {
		
		System.out.println("testModelAttribute执行了" + value);
		return "hello";
	}
	
	@ModelAttribute
	public void showmes(Map<String, String> map) {
		map.put("va", "hello");
		System.out.println(" showmes执行了");
	}
}
