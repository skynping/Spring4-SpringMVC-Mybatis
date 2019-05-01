package com.xx.www.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*	����ע��
 * 	RequestParam:��ȡ����
 * 	RequestBody����ȡ������
 * 	PathVariable����url�е�ռλ��
 * 	RequestHeader:�������ͷ��Ϣ
 * 	CookieValue: ���cookֵ
 *  ModelAttribute: �����ڷ����ϣ������ڿ��Ʒ���ִ��
 *  SessionAttribute
 * */
@Controller
@RequestMapping("/jsp")
public class annoController {
	
	// RequestParam�������name��ֵ��ֵ��username
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
		
		System.out.println("testModelAttributeִ����" + value);
		return "hello";
	}
	
	@ModelAttribute
	public void showmes(Map<String, String> map) {
		map.put("va", "hello");
		System.out.println(" showmesִ����");
	}
}
