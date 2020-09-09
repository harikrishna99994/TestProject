package com.demo.resrevation_mvc.model;

import org.springframework.stereotype.Component;

@Component
public class Reservation {

	private String firstName;
	private String lastName;

	public Reservation() {
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
