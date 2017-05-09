package com.mindtree.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="messageAnnotation")
@RequestScoped
public class MessageAnnotation {

	private String message = "From Message Object Using Annotation";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
