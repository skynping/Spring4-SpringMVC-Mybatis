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
		
		// ģ������ݿ��в��User����
		User user = new User();
		user.setAge(13);
		user.setId(1);
		user.setName("����");
		//���浽request����
		model.addAttribute("user",user);
		
		return "hello";
	}
	
	@RequestMapping("/void")
	public void testVoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ����ת��
		// ��Ҫдȫ·�������ᾭ��ǰ�˽�����
//		request.getRequestDispatcher("/jsp/hello.jsp").forward(request, response);
		
		// �ض���
		System.out.println(request.getContextPath() + "/jsp/hello.jsp");
		response.sendRedirect(request.getContextPath() + "/jsp/hello.jsp");
		return ;
	}
	
	@RequestMapping("/void2")
	public String testVoid2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// ����ת��
		return "forward:/jsp/hello.jsp";
		// �ض���
//		return "redirect:/jsp/hello.jsp";
	}
	
	@RequestMapping("/testAjax")
	@ResponseBody // ���ã� �Ѽ������صĶ���ת��json�ַ������ҷ�Ь�������
	public Map<String, Object> testAjax(@RequestBody String body) { // @RequestBodyǿ��Ҫ���������������json
		Map<String, Object> map = new HashMap<>();
		try {
			System.out.println(body);
			map.put("success", true);
			map.put("message", "�ϴ��ɹ�");
			
		}catch (Exception e) {
			map.put("success", false);
			map.put("message", "�ϴ�ʧ��");
		}
		return map;
	}
}
