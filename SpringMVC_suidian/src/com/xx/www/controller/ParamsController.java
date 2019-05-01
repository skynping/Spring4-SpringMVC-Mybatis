package com.xx.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xx.www.pojo.Children;
import com.xx.www.pojo.Customer;

@Controller
@RequestMapping("/jsp")
public class ParamsController {
	
	@RequestMapping("/params/test")
	public String test(String name,String password) {
		System.out.println("参数：" + name + " " + password);
//		返回跳转jsp文件名
		return "hello";
	}
	
	@RequestMapping("/customer/test")
	public String test(Customer customer) {
		
		System.out.println(customer);
		
		return "hello";
	}
	
	@RequestMapping("converter/test2")
	public String test2(Children children) {
		System.out.println(children);
		return "hello";
	}
}
