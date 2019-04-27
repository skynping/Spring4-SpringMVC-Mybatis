package com.xx.www.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.xx.www.demo.User;
import com.xx.www.mapper.UserMapper;

public class userMapperTest {
	SqlSessionFactory sqlSessionFactory = null;
	
	@Before
	public void init() throws IOException {
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
		sqlSessionFactory = builder.build(inputStream);
	}
	
	@Test
	public void testInsertUser() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		User user = new User();
		user.setName("Jack");
		user.setPassword("ubuntu");
		// 获取代理对象
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		userMapper.inserUser(user);
		sqlSession.commit();
		sqlSession.close();
	}
}
