package com.xx.www.utils;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

// �Զ���ת��������ʵ��Converter�ӿ�
public class StringToDateConverter implements Converter<String, Date>{

	@Override
	public Date convert(String source) {
		
		if(source == null) {
			throw new RuntimeException("��������Ϊ��");
		}
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		try {
			// ���ַ���תΪ����
			return df.parse(source);
		} catch (Exception e) {
			throw new RuntimeException("����ת���쳣");
		}
	}

	

}
