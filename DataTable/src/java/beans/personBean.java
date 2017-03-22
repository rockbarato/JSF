/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import classes.Person;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Felix Ayala <hi@felixaya.la>
 */
@Named(value = "personBean")
@Dependent
public class personBean {

	private Person person = new Person();
	private List<Person> lstPersonas = new ArrayList();

	public personBean() {
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public List<Person> getLstPersonas() {
		return lstPersonas;
	}

	public void setLstPersonas(List<Person> lstPersonas) {
		this.lstPersonas = lstPersonas;
	}

	public void addPerson() {
		this.lstPersonas.add(this.person);
	}
}
