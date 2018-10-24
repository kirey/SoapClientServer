package com.demo.soapservice;

/**
 * This class is input for a SOAP call
 * @author jovanovicn
 *
 */
public class PersonInput {

	private String name;
	private String lastName;
	private String monthOfBorn;
	
	
	public PersonInput(String name, String lastName, String monthOfBorn) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.monthOfBorn = monthOfBorn;
	}
	public PersonInput() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMonthOfBorn() {
		return monthOfBorn;
	}
	public void setMonthOfBorn(String monthOfBorn) {
		this.monthOfBorn = monthOfBorn;
	}
	
	
}
