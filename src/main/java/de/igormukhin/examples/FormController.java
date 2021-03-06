package de.igormukhin.examples;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("formController")
@Scope("request")
public class FormController {
	@Autowired
	private FormBean formBean;
	
	public void submit() {
		FacesContext.getCurrentInstance().addMessage(null, 
		        new FacesMessage("Value submitted: " + formBean.getField() + "."
		                + " Reload the page to see that the value still in the view scope."));
	}
	
}
