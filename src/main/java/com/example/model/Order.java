package com.example.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "order")
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int orderId;
	
	@Column(name="order_date", nullable = false, updatable = false)
	private Date orderDate;
	
	@Column(name="order_status", nullable = false, updatable = false)
	private String orderStatus;
	
	//collection of Items
	Map<Integer,String> items = new HashMap<Integer,String>();
	
	
	public Order(int orderId, Date orderDate, String orderStatus, Map<Integer, String> items) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.items = items;
		
		
	}
	
	public Order() {
		super();
	}

	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Map<Integer, String> getItems() {
		return items;
	}
	public void setItems(Map<Integer, String> items) {
		this.items = items;
	}
	
	
	

}
