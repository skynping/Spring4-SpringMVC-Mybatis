package com.xx.www.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xx.www.dao.UserDao;
import com.xx.www.pojo.User;

public class UserDaoTest {
	@Test
	public void test() {
		// ����spring����
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		// ��ȡ����
		UserDao userdao = (UserDao) app.getBean("userDao");
		
		List<User> list = userdao.findUserById(9);
		System.out.println(list);
		
		
	}
}
