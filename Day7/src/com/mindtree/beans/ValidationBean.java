package com.mindtree.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import com.sun.xml.internal.bind.CycleRecoverable.Context;

@ManagedBean
@SessionScoped
public class ValidationBean {
	
	private String bidId;
	public String getBidId() {
		return bidId;
	}
	public void setBidId(String bidId) {
		this.bidId = bidId;
	}
	public String getBidName() {
		return bidName;
	}
	public void setBidName(String bidName) {
		this.bidName = bidName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public long getDuration() {
		return duration;
	}
	public void setDuration(long duration) {
		this.duration = duration;
	}
	private String bidName;
	private double price;
	private long duration;

	//Action method....
	public String validateBid(){
		//Manual validaton of all ui tags
		
		FacesContext facesContext = FacesContext.getCurrentInstance();
		
		if ("".equals(bidId)){
			FacesMessage message = new FacesMessage("Bid Id is mandatory....");
			facesContext.addMessage("bidId", message);
		} else if (bidId.length() < 6) {
			FacesMessage message = new FacesMessage("Bid Id should be minimim 6 characters.");
			facesContext.addMessage("bidId", message);
		}
		
		if("".equals(bidName)){
			FacesMessage message = new FacesMessage("Bid Name is mandatory....");
			facesContext.addMessage("bidName", message);
		} else if (bidName.length() < 6) {
			FacesMessage message = new FacesMessage("Bid Name should be minimim 6 characters.");
			facesContext.addMessage("bidName", message);
		}
		
		if (price < 10){
			FacesMessage message = new FacesMessage("Bid Price should be greater tha 10.");
			facesContext.addMessage("price", message);
		}
		
		if (duration < 5){
			FacesMessage message = new FacesMessage("Bid Duration should be greater than 5.");
			facesContext.addMessage("duration", message);
		}
		
		if (facesContext.getMessageList().size() > 0){
			return null;
		}
		
		return "validationsuccess";
	}

	
	//Validator method....
	//UIComponent is the parent class for all UI Tags classes..
	//
	public void validateBidName(FacesContext context,
								UIComponent component,
								Object value
								)
						throws ValidatorException{
		String bName = (String) value;
		FacesMessage message = new FacesMessage("Bid Name should not contain '.' ");
		
		if(bName.indexOf(".")>=0){
			throw new ValidatorException(message);
		}
		
	}

}







