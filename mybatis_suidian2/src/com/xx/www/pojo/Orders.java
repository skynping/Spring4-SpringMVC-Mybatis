package com.xx.www.pojo;

public class Orders {
	private Integer customer_id;
	private Integer id;
	private String content;
	
	// 多对一
	@Override
	public String toString() {
		return "Orders [customer_id=" + customer_id + ", id=" + id + ", content=" + content + "]";
	}
	/*private Customer customer;
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}*/
	public Integer getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	// 一对一
	/*@Override
	public String toString() {
		return "Orders [customer_id=" + customer_id + ", id=" + id + ", content=" + content + ", customer=" + customer
				+ "]";
	}*/
	
}
