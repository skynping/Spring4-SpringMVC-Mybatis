package com.xx.www.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xx.www.mapper.UserMapper;
import com.xx.www.pojo.User;

public class UserMapperTest {
	@Test
	public void test() {
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		UserMapper um = app.getBean(UserMapper.class);
		
		List<User> list = um.findUserById(9);
		System.out.println(list);
	}
}
