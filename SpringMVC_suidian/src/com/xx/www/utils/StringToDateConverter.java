package com.xx.www.utils;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

// 自定义转换器，需实现Converter接口
public class StringToDateConverter implements Converter<String, Date>{

	@Override
	public Date convert(String source) {
		
		if(source == null) {
			throw new RuntimeException("传入数据为空");
		}
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		try {
			// 将字符串转为日期
			return df.parse(source);
		} catch (Exception e) {
			throw new RuntimeException("日期转换异常");
		}
	}

	

}
