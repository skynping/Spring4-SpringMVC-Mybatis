package com.xx.www.mapper;

import java.util.List;
import java.util.Map;

import com.xx.www.pojo.QueryUser;
import com.xx.www.pojo.User;

public interface UserMapper {
	public User findUserById(int id);
	public User findUserById3(int id);
	public List<User> findUsersByMap(Map<String, Object> map);
	public List<User> findUsersByQueryUser(QueryUser queryUser);
	public Map<String, Object> findUserById2(int id);
	public void inserUser(User user);
	public void updateUser(User user);
	public void deleteUser(int id);
	
	// ¶¯Ì¬sql
	public List<User> findUsersByMap2(Map<String, Object> map);
	public List<User> findUsersByQueryUser2(QueryUser queryUser);
	public void updateUser2(User user);
}
