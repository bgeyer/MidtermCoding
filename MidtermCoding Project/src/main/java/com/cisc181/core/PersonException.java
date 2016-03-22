package com.cisc181.core;

import java.util.Calendar;
import java.util.Date;

public class PersonException extends Exception {
	private Person person;

	public PersonException(Person person) {
		this.person = person;
		
}
}