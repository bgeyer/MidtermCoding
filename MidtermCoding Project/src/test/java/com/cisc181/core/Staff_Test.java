package com.cisc181.core;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;

import com.cisc181.core.PersonException;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}

	@Test
	public void testStaff1() throws PersonException {
		ArrayList<Staff> testStaff = new ArrayList<Staff>();
		Date birthDate = new Date(1960, 1, 1);
		System.out.println(birthDate);
		Date hireDate = new Date();
		Staff staffMember1 = new Staff("FirstName", "MiddleName", "LastName", birthDate, "Address", "(555)-555-5555",
				"Email", "officeHours", 0, 20000, hireDate, eTitle.MR);
		Staff staffMember2 = new Staff("FirstName", "MiddleName", "LastName", birthDate, "Address", "(555)-555-5555",
				"Email", "officeHours", 0, 30000, hireDate, eTitle.MR);
		Staff staffMember3 = new Staff("FirstName", "MiddleName", "LastName", birthDate, "Address", "(555)-555-5555",
				"Email", "officeHours", 0, 40000, hireDate, eTitle.MR);
		Staff staffMember4 = new Staff("FirstName", "MiddleName", "LastName", birthDate, "Address", "(555)-555-5555",
				"Email", "officeHours", 0, 50000, hireDate, eTitle.MR);
		Staff staffMember5 = new Staff("FirstName", "MiddleName", "LastName", birthDate, "Address", "(555)-555-5555",
				"Email", "officeHours", 0, 60000, hireDate, eTitle.MR);
		testStaff.add(staffMember1);
		testStaff.add(staffMember2);
		testStaff.add(staffMember3);
		testStaff.add(staffMember4);
		testStaff.add(staffMember5);
		double i = 0;
		for (Staff employee : testStaff) {
			i = i + employee.getSalary();
		}
		i = i / 5;
		double expectedValue = 40000;
		double actualValue = i;
		assertEquals(expectedValue, actualValue, 10);
	}

	@Test(expected = PersonException.class)
	public void testStaff2() throws PersonException {
		Date birthDate1 = new Date(10, 1, 1);
		Date hireDate = new Date();
		Staff staffMember1 = new Staff("FirstName", "MiddleName", "LastName", birthDate1, "Address", "(555)-555-5555",
				"Email", "officeHours", 0, 20000, hireDate, eTitle.MR);
	}
	@Test(expected = PersonException.class)
	public void testStaff3() throws PersonException {
		Date birthDate1 = new Date();
		Date hireDate = new Date();
		Staff staffMember1 = new Staff("FirstName", "MiddleName", "LastName", birthDate1, "Address", "6",
				"Email", "officeHours", 0, 20000, hireDate, eTitle.MR);
}
}