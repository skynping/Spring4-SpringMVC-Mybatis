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
	
	// MultipartFile picture 变量名必需和前台input的名称相同
	@RequestMapping("/pic")
	public String uploadPicture(MultipartFile picture) {
		
		String picName = picture.getOriginalFilename();
		String filename = UUID.randomUUID().toString();
		String subpathName = filename + picName.substring(picName.lastIndexOf("."));
		System.out.println("上传图片");
		// 保存文件
		try {
			picture.transferTo(new File("E:\\test\\" + subpathName));
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		
		return "hello";
	}
}
