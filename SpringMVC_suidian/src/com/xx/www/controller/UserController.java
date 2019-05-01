package com.xx.www.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xx.www.pojo.User;

@Controller
public class UserController {
	@RequestMapping("/list")
	public ModelAndView userList(HttpServletRequest request, HttpServletResponse response) {
		
		// 仿造数据
		List<User> lists = new ArrayList<>();
		for(int i=0;i<20;i++) {
			User user = new User();
			user.setAge(50-i);
			user.setId(i);
			user.setName("Tom" + i);
			lists.add(user);
		}
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("userList", lists);  // 相当于存入request域
		
		// 逻辑视图，即jsp的视图
//		modelAndView.setViewName("/WEB-INF/jsp/userList.jsp");
		// 配置视图解析器前缀后缀后直接用jsp文件名称
		modelAndView.setViewName("userList");
		return modelAndView;
	}
}
