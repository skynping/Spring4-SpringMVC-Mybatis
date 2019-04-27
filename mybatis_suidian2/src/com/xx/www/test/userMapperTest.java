package com.xx.www.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.xx.www.pojo.QueryUser;
import com.xx.www.pojo.User;
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
	
	@Test
	public void testFindUsersByMap() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		Map<String, Object> map = new HashMap<>();
		map.put("name", "王");
		map.put("id", 6);
		
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		List<User> list = userMapper.findUsersByMap(map);
		System.out.println(list);
		
		sqlSession.close();
	}
	
	@Test
	public void testFindUsersByQueryUser() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
		QueryUser queryUser = new QueryUser();
		User user = new User();
		user.setId(8);
		queryUser.setUser(user);

		List<User> list = userMapper.findUsersByQueryUser(queryUser);
		System.out.println(list);
		sqlSession.close();
	}
	
	@Test
	public void testFindUserById2() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
		Map<String, Object> map = userMapper.findUserById2(9);
		System.out.println(map);
		sqlSession.close();
	}
	
	@Test
	public void testFindUserById3() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
		User user = userMapper.findUserById3(9);
		System.out.println(user);
		
		sqlSession.close();
	}
	
	@Test
	public void testFindUsersByMap2() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
		Map<String, Object> map = new HashMap<>();
		map.put("id", 0);
		map.put("name", "J");
		
		List<User> list = userMapper.findUsersByMap2(map);
		System.out.println(list);
		sqlSession.close();
	}
	
	@Test
	public void testFindUsersByQueryUser2() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
		QueryUser queryUser = new QueryUser();
		List<Integer> list = new ArrayList<>();
		list.add(7);
		list.add(9);
		list.add(6);
		queryUser.setIds(list);
		
		List<User> lists = userMapper.findUsersByQueryUser2(queryUser);
		System.out.println(lists);
		sqlSession.close();
	}
	
	@Test
	public void testUpdateUser2() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
		User user = new User();
		user.setId(13);
		user.setName("Tom");
		userMapper.updateUser2(user);
		sqlSession.commit();
		sqlSession.close();
	}
}
