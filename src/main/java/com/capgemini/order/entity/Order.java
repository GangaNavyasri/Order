package com.capgemini.order.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order {
	@Id
	private int orderId;
	private int customerId;
	private int products;
	private LocalDateTime orderDate;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Order(int orderId, int customerId, int products, LocalDateTime orderDate) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.products = products;
		this.orderDate = orderDate;
	}

	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
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
		return "Order [orderid=" + orderId + ", customerId=" + customerId + ", productId=" + products + ", orderDate="
				+ orderDate + "]";
	}
	
	

}
