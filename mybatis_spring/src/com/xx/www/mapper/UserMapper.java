package com.xx.www.mapper;

import java.util.List;

import com.xx.www.pojo.User;

public interface UserMapper {
	public List<User> findUserById(Integer id);
}
