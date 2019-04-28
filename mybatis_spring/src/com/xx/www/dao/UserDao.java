package com.xx.www.dao;

import java.util.List;

import com.xx.www.pojo.User;

public interface UserDao {
	public List<User> findUserById(Integer id);
}
