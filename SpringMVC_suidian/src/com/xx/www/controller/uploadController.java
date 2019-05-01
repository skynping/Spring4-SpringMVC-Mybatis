package com.xx.www.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/jsp/upload")
public class uploadController {
	
	// MultipartFile picture �����������ǰ̨input��������ͬ
	@RequestMapping("/pic")
	public String uploadPicture(MultipartFile picture) {
		
		String picName = picture.getOriginalFilename();
		String filename = UUID.randomUUID().toString();
		String subpathName = filename + picName.substring(picName.lastIndexOf("."));
		System.out.println("�ϴ�ͼƬ");
		// �����ļ�
		try {
			picture.transferTo(new File("E:\\test\\" + subpathName));
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		
		return "hello";
	}
}
