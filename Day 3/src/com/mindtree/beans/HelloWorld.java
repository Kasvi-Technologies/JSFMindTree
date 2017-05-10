package com.mindtree.beans;

//Command Design Patterns
//Command Object -> HelloWorld
public class HelloWorld {
	
	private String message = "Hello World";

	private String userName;
	private String password;
	
	private String type;
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	private Message messageObj;
	
	public Message getMessageObj() {
		return messageObj;
	}

	public void setMessageObj(Message messageObj) {
		this.messageObj = messageObj;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}	
	
	//default signature of action methods....
	public String login(){
		System.out.println("in login method.....");
		return "success";		
	}
	
	//conditional navigation....
	public String performLogin() {
		//If username and password both are admin, then will go to success.jsf page
		//else will go to failure.jsf page..
		if("Admin".equals(getUserName()) && "Admin".equals(getPassword())) {
			return "success";
		} else {
			return "failure";
		}
	}
	
	//Example of from-action
	public String page1(){
		return "successpage";  //success.jsf
	}
	
	public String page2(){
		return "successpage"; //page2.jsf
	}
	
	//usng explicit parameter 
	public String performOperation() {
		if ("add".equals(type)) {
			System.out.println("Add method logic...........");
		} else if ("delete".equals(type)) {
			System.out.println("Delete method logic...........");
		} else if("modify".equals(type)){
			System.out.println("Modify method logic...........");
		}
		return "success";
	}

}
