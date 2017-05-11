package com.mindtree.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="helloWorldAnnotation")
@RequestScoped
//@NoneScoped, ViewScoped, SessionScoped, ApplicationScoped
public class HelloWorldAnnotation {

	private String message = "Hello World Using Annotations";

	@ManagedProperty(value="#{param.method}")
	private String type;
	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@ManagedProperty(value="#{messageAnnotation}")
	private MessageAnnotation messageObj;
	
	public MessageAnnotation getMessageObj() {
		return messageObj;
	}

	public void setMessageObj(MessageAnnotation messageObj) {
		this.messageObj = messageObj;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
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
