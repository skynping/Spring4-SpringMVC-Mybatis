package com.xx.www.daoImp;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.xx.www.dao.UserDao;
import com.xx.www.pojo.User;

public class UserDaoImp extends SqlSessionDaoSupport implements UserDao {

	@Override
	public List<User> findUserById(Integer id) {
		SqlSession sqlSession = this.getSqlSession();
		List<User> list = sqlSession.selectList("findUserById", id);
		return list;
	}

}
