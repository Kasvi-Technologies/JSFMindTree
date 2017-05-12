package com.samples.uitags;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.mindtree.beans.Product;

@ManagedBean(name="productDataTable")
@SessionScoped
public class ProductDataTable {

	public ProductDataTable () {
		Product p1 = new Product(1001, "Soaps", 100, 5);
		Product p2 = new Product(1002, "Vehicles", 100000, 10);
		Product p3 = new Product(1003, "Mobiles", 50, 100);
		Product p4 = new Product(1004, "Shirts", 100000, 10);
		Product p5 = new Product(1005, "Product5", 100000, 10);
		Product p6 = new Product(1006, "Product6", 100000, 10);
		Product p7 = new Product(1007, "Product7", 100000, 10);
		
		productList = new ArrayList<Product>();

		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		productList.add(p4);
		productList.add(p5);
		productList.add(p6);
		productList.add(p7);
		
	}
	private List<Product> productList;

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	
	
}
