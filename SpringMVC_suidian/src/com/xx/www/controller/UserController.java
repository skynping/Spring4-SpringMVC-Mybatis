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
		
		// ��������
		List<User> lists = new ArrayList<>();
		for(int i=0;i<20;i++) {
			User user = new User();
			user.setAge(50-i);
			user.setId(i);
			user.setName("Tom" + i);
			lists.add(user);
		}
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("userList", lists);  // �൱�ڴ���request��
		
		// �߼���ͼ����jsp����ͼ
//		modelAndView.setViewName("/WEB-INF/jsp/userList.jsp");
		// ������ͼ������ǰ׺��׺��ֱ����jsp�ļ�����
		modelAndView.setViewName("userList");
		return modelAndView;
	}
}
