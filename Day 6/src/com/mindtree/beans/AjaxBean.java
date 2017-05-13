package com.mindtree.beans;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="ajaxBean")
@SessionScoped
public class AjaxBean {
	
	public AjaxBean() {
		countries = new String[] {"India", "US", "UK", "Singapore", "Dubai"};
		country = "India";
	}
	
	private String city;
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String[] getCities() {
		
		if ("Karnataka".equals(state)) {
			cities = new String[] {"Bangalore", "Mangalore", "Hosur", "Hoskote"};
		} else if ("AP".equals(state)) {
			cities = new String[] {"BZA", "Tirupathi", "Nellore"};
		} else {
			cities = new String[] {"asdsadsad", "sdsadsad", "sadsad"};
		}

		
		return cities;
	}

	public void setCities(String[] cities) {
		this.cities = cities;
	}

	private String[] cities;
	
	private String state;
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String[] getCountries() {
		return countries;
	}

	public void setCountries(String[] countries) {
		this.countries = countries;
	}

	public String[] getStates() {
		
		if ("India".equals(country)) {
			states = new String[] {"Karnataka", "AP", "TN", "TN"};
		} else if ("US".equals(country)) {
			 
		} else {
			states = new String[] {"Californika213213", "Pleasanto213213213n", "Sanfransisco213213"};
		}
		return states;
	}

	public void setStates(String[] states) {
		this.states = states;
	}


	private String country;
	
	private String[] countries;
	private String[] states;

	public Date date = new Date();
	public String dateStr;
	public String getDateStr() {
		return dateStr;
	}

	public void setDateStr(String dateStr) {
		this.dateStr = dateStr;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
	public String latestDate(){
		
		//BL
		date = new Date();
		//ths var will have the latest values
		dateStr = date.toString();
		
		//BL logic completed....
		return null;
	}
	
	
}
