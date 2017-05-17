package com.ecommerce.login;

public class Mobile extends Item{

	public Mobile(String id, String companyName, String model, double price) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.model = model;
		this.price = price;
	}
	private String id;
	private String companyName;
	private String model;
	private double price;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
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
	private int qty;
}
