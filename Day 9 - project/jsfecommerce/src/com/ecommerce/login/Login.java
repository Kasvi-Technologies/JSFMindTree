package com.ecommerce.login;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean(name="loginBean")
@SessionScoped
public class Login {

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
	
	public String login(){
		
		FacesContext facesContext = FacesContext.getCurrentInstance();
		ExternalContext externalContext = facesContext.getExternalContext();
		
		List<User> usersLst = (ArrayList<User>) externalContext.getSessionMap().get("usersList");
		
		boolean found = false;
		for (int i=0; usersLst!=null &&i< usersLst.size();i++) {
			User u = usersLst.get(i);
			
			if(u.getUserName().equals(getUserName()) && u.getPassword().equals(getPassword())){
				found = true;
				break;
			} 
		}
		
		if (found ==false) {
			facesContext.addMessage("errorMsg", new FacesMessage("Credentials are invalid!"));
			return null;
			
		}  else {
			return "listing";
		}
		
	}
	
}
