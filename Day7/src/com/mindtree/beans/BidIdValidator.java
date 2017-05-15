package com.mindtree.beans;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("bidIdValidator")
public class BidIdValidator implements Validator{

	public void validate(FacesContext context, UIComponent component, Object value)
			throws ValidatorException {
		String bName = (String) value;
		FacesMessage message = new FacesMessage("Bid Name should not contain '.' ");
		
		if(bName.indexOf(".")>=0){
			throw new ValidatorException(message);
		}
		
	}

}
