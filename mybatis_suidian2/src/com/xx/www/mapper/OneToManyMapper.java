package com.xx.www.mapper;

import java.util.List;

import com.xx.www.pojo.Customer;

public interface OneToManyMapper {
	public List<Customer> findOrderById(Integer id);
}
