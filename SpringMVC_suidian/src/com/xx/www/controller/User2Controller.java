package com.xx.www.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xx.www.pojo.User;

@Controller
@RequestMapping("/jsp")
public class User2Controller {
	
	@RequestMapping("/string")
	public String testString(Model model) {
		
		// 模拟从数据库中查出User对象
		User user = new User();
		user.setAge(13);
		user.setId(1);
		user.setName("张三");
		//储存到request域中
		model.addAttribute("user",user);
		
		return "hello";
	}
	
	@RequestMapping("/void")
	public void testVoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 请求转发
		// 需要写全路径，不会经过前端解析器
//		request.getRequestDispatcher("/jsp/hello.jsp").forward(request, response);
		
		// 重定向
		System.out.println(request.getContextPath() + "/jsp/hello.jsp");
		response.sendRedirect(request.getContextPath() + "/jsp/hello.jsp");
		return ;
	}
	
	@RequestMapping("/void2")
	public String testVoid2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 请求转发
		return "forward:/jsp/hello.jsp";
		// 重定向
//		return "redirect:/jsp/hello.jsp";
	}
	
	@RequestMapping("/testAjax")
	@ResponseBody // 作用： 把即将返回的对象转成json字符串并且飞鞋到浏览器
	public Map<String, Object> testAjax(@RequestBody String body) { // @RequestBody强制要求传入参数的类型是json
		Map<String, Object> map = new HashMap<>();
		try {
			System.out.println(body);
			map.put("success", true);
			map.put("message", "上传成功");
			
		}catch (Exception e) {
			map.put("success", false);
			map.put("message", "上传失败");
		}
		return map;
	}
}
