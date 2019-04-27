package com.xx.www.mapper;

import com.xx.www.demo.User;

public interface UserMapper {
	public User findUserById(int id);
	public void inserUser(User user);
	public void updateUser(User user);
	public void deleteUser(int id);
}
