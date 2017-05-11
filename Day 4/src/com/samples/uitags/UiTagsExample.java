package com.samples.uitags;

import java.util.Arrays;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UiTagsExample {

	private String username;
	private String password;
	private String hidden;
	private boolean read =true;
	private String gender;
	
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
	
	
}
