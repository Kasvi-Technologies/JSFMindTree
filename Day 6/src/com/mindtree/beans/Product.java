package com.mindtree.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


public class Product {
	
	public Product() {
		
	}
	
	
	
	public Product(long productId, String productName, double price, int qty) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.qty = qty;
	}



	private long productId;
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	private String productName;
	private double price;
	private int qty;
	
	

}
