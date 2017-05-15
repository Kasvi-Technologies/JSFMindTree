package com.mindtree.beans;



import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

@ManagedBean(name="localeBean")
@SessionScoped
public class LocaleBean {

	private String localeCode = "en";
	
	public String getLocaleCode() {
		return localeCode;
	}

	public void setLocaleCode(String localeCode) {
		this.localeCode = localeCode;
	}

	public void changeLocale(ActionEvent event){
		
		FacesContext facesContext = FacesContext.getCurrentInstance();
		localeCode = facesContext.getExternalContext().getRequestParameterMap().get("localeCode");
		
	}
}
