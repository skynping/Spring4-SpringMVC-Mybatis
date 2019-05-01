package com.xx.www.pojo;

import java.io.Serializable;

public class Order implements Serializable{
	private String car;
	private String money;
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "Order [car=" + car + ", money=" + money + "]";
	}
	
}
