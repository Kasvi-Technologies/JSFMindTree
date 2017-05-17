package com.ecommerce.login;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;


@ManagedBean(name="products")
@SessionScoped

public class Products {

	public Products (){
		
		Mobile m = new Mobile("M100", "Motorola", "XPlay", 15000);
		Mobile m1 = new Mobile("M101", "Samsung", "Duos", 7000);
		Mobile m2 = new Mobile("M102", "Samsung", "Galaxy", 12000);
		Mobile m3 = new Mobile("M103", "Apple", "iPhone", 65000);
		mobileList.add(m);
		mobileList.add(m1);
		mobileList.add(m2);
		mobileList.add(m3);
		
		
		Accessories a = new Accessories("A100", "Motorola", "Ear Phones", 2000);
		Accessories a1 = new Accessories("A101", "Motorola", "Head set", 3000);
		Accessories a2 = new Accessories("A103", "Motorola", "Speakers", 10000);
		Accessories a3 = new Accessories("A102", "Samsung", "Battery", 5000);
		
		accessoriesList.add(a);
		accessoriesList.add(a1);
		accessoriesList.add(a2);
		accessoriesList.add(a3);
		
		TV t = new TV("T100", "LG", "flatron", 10000);
		TV t1 = new TV("T101", "Sansui", "flatron", 16000);
		TV t2 = new TV("T102", "Samsung", "LCD", 50000);
		TV t3 = new TV("T103", "Samsung", "LED", 75000);
		
		tvList.add(t);
		tvList.add(t1);
		tvList.add(t2);
		tvList.add(t3);
	}
	
	private List<Mobile> mobileList = new ArrayList<Mobile>();
	public List<Mobile> getMobileList() {
		return mobileList;
	}
	public List<Accessories> getAccessoriesList() {
		return accessoriesList;
	}
	public List<TV> getTvList() {
		return tvList;
	}

	private List<Accessories> accessoriesList = new ArrayList<Accessories>();
	private List<TV> tvList = new ArrayList<TV>();
	private boolean mobiles;
	private boolean tv;
	private boolean accessories;
	
	
	public boolean isMobiles() {
		return mobiles;
	}
	public void setMobiles(boolean mobiles) {
		this.mobiles = mobiles;
	}
	public boolean isTv() {
		return tv;
	}
	public void setTv(boolean tv) {
		this.tv = tv;
	}
	public boolean isAccessories() {
		return accessories;
	}
	public void setAccessories(boolean accessories) {
		this.accessories = accessories;
	}

	public String addToCart(){
		return null;
	}
	public String addMobilesToCart(Mobile m){
		
		FacesContext facesContext = FacesContext.getCurrentInstance();
		ExternalContext externalContext = facesContext.getExternalContext();
		
		List itemsLst = (ArrayList) externalContext.getSessionMap().get("selectedItems");
		List<String> idsList = (ArrayList<String>) externalContext.getSessionMap().get("selectedIds");
	
		if(itemsLst == null) {
			itemsLst = new ArrayList();
			idsList = new ArrayList<String>();
			
		}	
		System.out.println(m.getId() + " " + m.getQty());
		System.out.println(idsList);
		if (idsList.contains(m.getId())) {
			System.out.println("true...");
			int index = idsList.indexOf(m.getId());
			itemsLst.remove(index);
			itemsLst.add(index, m);
			
		} else {
			System.out.println("false");
			itemsLst.add(m);
			idsList.add(m.getId());
		}		
		
		System.out.println(itemsLst.size());
		externalContext.getSessionMap().put("selectedItems", itemsLst);
		externalContext.getSessionMap().put("selectedIds", idsList);
	
		return null;
	}
	
	public String addAccessoriesToCart(Accessories m){
		
		FacesContext facesContext = FacesContext.getCurrentInstance();
		ExternalContext externalContext = facesContext.getExternalContext();
		
		List itemsLst = (ArrayList) externalContext.getSessionMap().get("selectedItems");
		List<String> idsList = (ArrayList<String>) externalContext.getSessionMap().get("selectedIds");
	
		if(itemsLst == null) {
			itemsLst = new ArrayList();
			idsList = new ArrayList<String>();
			
		}	
		System.out.println(m.getId() + " " + m.getQty());
		
		if (idsList.contains(m.getId())) {
			int index = idsList.indexOf(m.getId());
			itemsLst.remove(index);
			itemsLst.add(index, m);
		} else {
			itemsLst.add(m);
			idsList.add(m.getId());
		}		
		
		externalContext.getSessionMap().put("selectedItems", itemsLst);
		externalContext.getSessionMap().put("selectedIds", idsList);
		
		System.out.println(itemsLst.size());
		return null;
	}
	
	public String addTVsToCart(TV m){
	
	FacesContext facesContext = FacesContext.getCurrentInstance();
	ExternalContext externalContext = facesContext.getExternalContext();
	
	List itemsLst = (ArrayList) externalContext.getSessionMap().get("selectedItems");
	List<String> idsList = (ArrayList<String>) externalContext.getSessionMap().get("selectedIds");

	if(itemsLst == null) {
		itemsLst = new ArrayList();
		idsList = new ArrayList<String>();
		
	}	
	
	System.out.println(m.getId() + " " + m.getQty());
	
	if (idsList.contains(m.getId())) {
		
		int index = idsList.indexOf(m.getId());
		itemsLst.remove(index);
		itemsLst.add(index, m);
	} else {
		itemsLst.add(m);
		idsList.add(m.getId());
	}
	
	
	System.out.println(itemsLst.size());
	externalContext.getSessionMap().put("selectedItems", itemsLst);
	externalContext.getSessionMap().put("selectedIds", idsList);

	return null;
}
}
