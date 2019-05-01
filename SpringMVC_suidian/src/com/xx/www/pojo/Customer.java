package com.xx.www.pojo;

import java.io.Serializable;

public class Customer implements Serializable{
	private String name;
	private Integer age;
	private String password;
	private Order order;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", password=" + password + ", order=" + order + "]";
	}
	
}
