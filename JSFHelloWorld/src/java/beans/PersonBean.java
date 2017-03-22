/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Felix Ayala <hi@felixaya.la>
 */
@Named(value = "personBean")
@RequestScoped
public class PersonBean {
	
	private String name;
	private String message;

	/**
	 * Creates a new instance of PersonBean
	 */
	public PersonBean() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void saludar() {
		this.message = "Hola, tu nombre es " + this.name;
	}
	
}
