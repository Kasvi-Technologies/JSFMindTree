package com.ecommerce.login;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean(name="registration")
@ApplicationScoped

public class Registration {


	public Registration() {
		countries = new String[] {"India", "US", "UK", "Singapore", "Dubai"};
		country = "India";
	}
	
	private String gender;
	
	private boolean exists = false;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public String[] getDefaultGenders(){
		return new String[] {"Male", "Female"};
	}
	private boolean read;
	
	public boolean isRead() {
		return read;
	}
	public void setRead(boolean read) {
		this.read = read;
	}

	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	private long mobile;
	
	private String userName;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String password;
	
	
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
			states = new String[] {"California", "Pleasanton", "Sanfransisco"};
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
	
	public String performSignUp() {
		
		User user = new User(getUserName(), getPassword(), getGender(), getEmail(), getCountry(), getState(), getCity(), getMobile());
		
		FacesContext facesContext = FacesContext.getCurrentInstance();
		ExternalContext externalContext = facesContext.getExternalContext();
		
		List<User> usersLst = (ArrayList<User>) externalContext.getSessionMap().get("usersList");
		
		if(usersLst == null) {
			usersLst = new ArrayList<User>();
			usersLst.add(user);
		} else {
			usernamecheck();
			
			if(exists ==false) {
				usersLst.add(user);	
			} else {
				exists = false;
				return null;
			}
			
		}
		
		externalContext.getSessionMap().put("usersList", usersLst);
		
		return "login?redirect=true";
	}

	public String usernamecheck(){
		
		FacesContext facesContext = FacesContext.getCurrentInstance();
		ExternalContext externalContext = facesContext.getExternalContext();
		
		List<User> usersLst = (ArrayList<User>) externalContext.getSessionMap().get("usersList");
	
		for (int i=0; usersLst!=null &&i< usersLst.size();i++) {
			User u = usersLst.get(i);
			
			if(u.getUserName().equals(getUserName())){
				exists = true;
				facesContext.addMessage("username", new FacesMessage("username already exists!!!!!!!!!!!!"));
			}
		}
		
		if (facesContext.getMessageList().size() ==0){
			facesContext.addMessage("username", new FacesMessage("Congrats !!!! username is available."));
			
		}
		return null;
	}
}

