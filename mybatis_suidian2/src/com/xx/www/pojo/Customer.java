package com.xx.www.pojo;

import java.util.List;

public class Customer {
	private Integer age;
	private Integer id;
	private String name;
	// ���һ
	private List<Orders> listOrders;
	
	// һ��һ
	/*@Override
	public String toString() {
		return "Customer [age=" + age + ", id=" + id + ", name=" + name + "]";
	}*/
	
	// ���һ
	@Override
	public String toString() {
		return "Customer [age=" + age + ", id=" + id + ", name=" + name + ", listOrders=" + listOrders + "]";
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
