package com.samples.uitags;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import com.mindtree.beans.Product;

@ManagedBean
@SessionScoped
public class UiTagsExample {

	private String username;
	private String password;
	private String hidden;
	private boolean read =true;
	private String gender;
	private Product product = new Product();
	
	private String state;
	public String getState() {
		System.out.println("state:" + state);
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public List<String> getStatesList() {
		return statesList;
	}

	public void setStatesList(List<String> statesList) {
		this.statesList = statesList;
	}
	private List<String> statesList = new ArrayList<String>();
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	private String country ="India";
	
	
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	private String[] hobbies;
	
	private String[] defaultHobbies = {"Sports", "Reading", "Dancing", "Cooking"};
	
	public String[] getCountries(){
		
		return new String[] {"Australia", "Sri Lanka", "India", "US", "UK"};
	}
	public String[] getDefaultGenders(){
		return new String[] {"Male", "Female"};
	}
	
	public String[] getDefaultHobbies() {
		return defaultHobbies;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	
	public String getHobbiesValues(){
		return Arrays.toString(hobbies);
		
	}
	
	public boolean isRead() {
		return read;
	}
	public void setRead(boolean isRead) {
		this.read = isRead;
	}
	public String getHidden() {
		return hidden;
	}
	public void setHidden(String hidden) {
		this.hidden = hidden;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String addProduct(){
		
		//needs to add the product object to the productList
		//productList is available in ProductDataTable class., your productDataTable is in session scope
		
		FacesContext facesContext = FacesContext.getCurrentInstance();
		ExternalContext externalContext = facesContext.getExternalContext();
		
		ProductDataTable productDataTable = (ProductDataTable) externalContext.getSessionMap().get("productDataTable");
		productDataTable.getProductList().add(product);
		System.out.println("Size:" + productDataTable.getProductList().size());
		
		return null;  // current page
	}
	
	public void fetchStates(ValueChangeEvent event){
	System.out.println("In fetch States....");
		String country = (String) event.getNewValue();
		
		if (country.equals("India")) {
			state="Karnataka";
			statesList = new ArrayList<String>();
			statesList.add("Karnataka");
			statesList.add("Andhra Pradesh");
			statesList.add("Thamilnadu");
		} else {
			state="sdasd";
			statesList = new ArrayList<String>();
			statesList.add("sadsad");
			statesList.add("sdasd");
			statesList.add("sadsadsadsad");
		}
	}
	
	
	
}
