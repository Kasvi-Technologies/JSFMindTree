
package com.ecommerce.login;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class Checkout {

	private boolean read;
	
	public boolean isRead() {
		return read;
	}

	public void setRead(boolean read) {
		this.read = read;
	}

	public String performCheckout(){
		return null;
	}
	
	public double getTotalprice(){
		
		FacesContext facesContext = FacesContext.getCurrentInstance();
		ExternalContext externalContext = facesContext.getExternalContext();
		
		List itemsLst = (ArrayList) externalContext.getSessionMap().get("selectedItems");
		
		double price = 0.0;

		for (int i=0; i< itemsLst.size();i++) {
			
			Object obj = itemsLst.get(i);
			
			if(obj instanceof Mobile){
				Mobile m = (Mobile)obj;
				price = price + (m.getQty() * m.getPrice());
			} else if(obj instanceof Accessories){
				Accessories m = (Accessories)obj;
				price = price + (m.getQty() * m.getPrice());
			}else if(obj instanceof TV){
				TV m = (TV)obj;
				price = price + (m.getQty() * m.getPrice());
			}
		}
		
		return price;		
	}
	
}
