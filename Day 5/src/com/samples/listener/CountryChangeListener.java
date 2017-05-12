package com.samples.listener;

import java.util.ArrayList;
import java.util.List;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

import com.samples.uitags.ProductDataTable;
import com.samples.uitags.UiTagsExample;

public class CountryChangeListener implements ValueChangeListener{

	public void processValueChange(ValueChangeEvent event)
			throws AbortProcessingException {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		ExternalContext externalContext = facesContext.getExternalContext();
		
		
		UiTagsExample uiTagsExample = (UiTagsExample) externalContext.getSessionMap().get("uiTagsExample");
		
		System.out.println("In fetch States....");
		String country = (String) event.getNewValue();
		
		if (country.equals("India")) {
			uiTagsExample.setState("Karnataka");
			List<String> statesList = new ArrayList<String>();
			statesList.add("Karnataka");
			statesList.add("Andhra Pradesh");
			statesList.add("Thamilnadu");
			uiTagsExample.setStatesList(statesList);
		} else {
			uiTagsExample.setState("sdasd");
			List<String> statesList = new ArrayList<String>();
			statesList.add("sadsad");
			statesList.add("sdasd");
			statesList.add("sadsadsadsad");
			uiTagsExample.setStatesList(statesList);
		}
		
		
	}

}
