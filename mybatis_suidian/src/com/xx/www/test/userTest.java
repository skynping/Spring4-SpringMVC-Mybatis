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
	
	// ��ѯ
	@Test
	public void testFindUserById() throws IOException {
//		1. ��ȡsqlSessionFactory����
		
		// 2.��ȡsqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 3.ʹ��sqlSession�ķ���
		// ��һ������ִ��sql�ķ������ڶ�������ռλ��������
		User user = sqlSession.selectOne("findUserById",5);
		System.out.println(user);
		// 4.�ر�sqlSession
		sqlSession.close();
	}
	
	@Test
	public void testFindUserByName() throws IOException {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<User> list = sqlSession.selectList("findUserByName","��");
		System.out.println(list);
		sqlSession.close();
	}
	
	// ����
	@Test
	public void testInsertUser() throws IOException{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		User user = new User();
		user.setName("����");
		user.setPassword("123");
		
		sqlSession.insert("inserUser",user);
		sqlSession.commit();
		sqlSession.close();
		System.out.println(user);
	}
	
	// �޸�
	@Test
	public void testUpdateUser() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		User user = new User();
		user.setName("����ɽ");
		user.setId(4);
		user.setPassword("123456");
		sqlSession.update("updateUser", user);
		sqlSession.commit();
		sqlSession.close();
	}
	
	// ɾ��
	@Test
	public void testDeleteUser() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("deleteUser",8);
		sqlSession.commit();
		sqlSession.close();
	}
}
