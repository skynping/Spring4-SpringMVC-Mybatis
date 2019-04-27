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

import com.xx.www.mapper.OneToManyMapper;
import com.xx.www.pojo.Customer;


public class OneToManyMapperTest {
	SqlSessionFactory sqlSessionFactory = null;
	
	@Before
	public void init() throws IOException {
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
		sqlSessionFactory = builder.build(inputStream);
	}
	
	@Test
	public void testFindOrderById() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		OneToManyMapper mapper = sqlSession.getMapper(OneToManyMapper.class);
		List<Customer> list = mapper.findOrderById(3);
		System.out.println(list);
		
		sqlSession.close();
	}
}
