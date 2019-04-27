package com.xx.www.mapper;

import java.util.List;

import com.xx.www.pojo.Orders;

public interface OneToOneMapper {
	public List<Orders> findOrderById(Integer id);
}
