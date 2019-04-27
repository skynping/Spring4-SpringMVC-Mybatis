package com.xx.www.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.xx.www.demo.User;

public class userTest {
	
	SqlSessionFactory sqlSessionFactory = null;
	
	@Before
	public void init() throws IOException {
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
		sqlSessionFactory = builder.build(inputStream);
	}
	
	// 查询
	@Test
	public void testFindUserById() throws IOException {
//		1. 获取sqlSessionFactory对象
		
		// 2.获取sqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 3.使用sqlSession的方法
		// 第一个参数执行sql的方法，第二个参数占位符的内容
		User user = sqlSession.selectOne("findUserById",5);
		System.out.println(user);
		// 4.关闭sqlSession
		sqlSession.close();
	}
	
	@Test
	public void testFindUserByName() throws IOException {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<User> list = sqlSession.selectList("findUserByName","李");
		System.out.println(list);
		sqlSession.close();
	}
	
	// 插入
	@Test
	public void testInsertUser() throws IOException{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		User user = new User();
		user.setName("王五");
		user.setPassword("123");
		
		sqlSession.insert("inserUser",user);
		sqlSession.commit();
		sqlSession.close();
		System.out.println(user);
	}
	
	// 修改
	@Test
	public void testUpdateUser() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		User user = new User();
		user.setName("张三山");
		user.setId(4);
		user.setPassword("123456");
		sqlSession.update("updateUser", user);
		sqlSession.commit();
		sqlSession.close();
	}
	
	// 删除
	@Test
	public void testDeleteUser() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("deleteUser",8);
		sqlSession.commit();
		sqlSession.close();
	}
}
