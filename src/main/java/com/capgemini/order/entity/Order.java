package com.capgemini.order.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order {
	@Id
	private int orderid;
	private int customerId;
	private int products;
	private LocalDateTime orderDate;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Order(int orderid, int customerId, int products, LocalDateTime orderDate) {
		super();
		this.orderid = orderid;
		this.customerId = customerId;
		this.products = products;
		this.orderDate = orderDate;
	}

	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public int getProducts() {
		return products;
	}

	public void setProducts(int products) {
		this.products = products;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", customerId=" + customerId + ", productId=" + products + ", orderDate="
				+ orderDate + "]";
	}
	
	

}
