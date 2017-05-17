package com.ecommerce.login;

public class User {

	
	public User(String userName, String password,String gender, String email, 
			String country, String state, String city, long mobile) {
		super();
		this.gender = gender;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.country = country;
		this.state = state;
		this.city = city;
		this.mobile = mobile;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	private String gender;
	private String email;
	private String userName;
	private String password;
	private String country;
	private String state;
	private String city;
	private long mobile;
	
}
