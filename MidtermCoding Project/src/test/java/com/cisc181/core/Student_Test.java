package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
import com.cisc181.eNums.eTitle;

public class Student_Test {

	@BeforeClass
	public static void setup() {
		
		
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
	@Test
	public void testGPA() throws PersonException {
		ArrayList<Student> testStudent = new ArrayList<Student>();
		Course course1 = new Course();
		Course course2 = new Course();
		Course course3 = new Course();
		ArrayList<Course> testCourse = new ArrayList<Course>();
		testCourse.add(course1);
		testCourse.add(course2);
		testCourse.add(course3);
		
		Semester fall = new Semester();
		Semester spring = new Semester();
		ArrayList<Semester> testSemester = new ArrayList<Semester>();
		testSemester.add(fall);
		testSemester.add(spring);
		
		Section section1 = new Section(course1.getCourseID(), fall.getSemesterID());
		Section section2 = new Section(course2.getCourseID(), fall.getSemesterID());
		Section section3 = new Section(course3.getCourseID(), fall.getSemesterID());
		Section section4 = new Section(course1.getCourseID(), spring.getSemesterID());
		Section section5 = new Section(course2.getCourseID(), spring.getSemesterID());
		Section section6 = new Section(course3.getCourseID(), spring.getSemesterID());
		ArrayList<Section> testSection = new ArrayList<Section>();
		testSection.add(section1);
		testSection.add(section2);
		testSection.add(section3);
		testSection.add(section4);
		testSection.add(section5);
		testSection.add(section6);
		
		Date birthDate = new Date();
		Student student1 = new Student("FirstName", "MiddleName", "LastName", birthDate, eMajor.PHYSICS, "Address",
				"(555)-555-5555", "Email");
		Student student2 = new Student("FirstName", "MiddleName", "LastName", birthDate, eMajor.BUSINESS, "Address",
				"(555)-555-5555", "Email");
		Student student3 = new Student("FirstName", "MiddleName", "LastName", birthDate, eMajor.COMPSI, "Address",
				"(555)-555-5555", "Email");
		Student student4 = new Student("FirstName", "MiddleName", "LastName", birthDate, eMajor.NURSING, "Address",
				"(555)-555-5555", "Email");
		Student student5 = new Student("FirstName", "MiddleName", "LastName", birthDate, eMajor.CHEM, "Address",
				"(555)-555-5555", "Email");
		Student student6 = new Student("FirstName", "MiddleName", "LastName", birthDate, eMajor.COMPSI, "Address",
				"(555)-555-5555", "Email");
		Student student7 = new Student("FirstName", "MiddleName", "LastName", birthDate, eMajor.PHYSICS, "Address",
				"(555)-555-5555", "Email");
		Student student8 = new Student("FirstName", "MiddleName", "LastName", birthDate, eMajor.NURSING, "Address",
				"(555)-555-5555", "Email");
		Student student9 = new Student("FirstName", "MiddleName", "LastName", birthDate, eMajor.CHEM, "Address",
				"(555)-555-5555", "Email");
		Student student10 = new Student("FirstName", "MiddleName", "LastName", birthDate, eMajor.CHEM, "Address",
				"(555)-555-5555", "Email");
		testStudent.add(student1);
		testStudent.add(student2);
		testStudent.add(student3);
		testStudent.add(student4);
		testStudent.add(student5);
		testStudent.add(student6);
		testStudent.add(student7);
		testStudent.add(student8);
		testStudent.add(student9);
		testStudent.add(student10);
		
		for(Student students:testStudent) {
			for(Section sections:testSection) {
				Enrollment enrollment = new Enrollment(sections.getSectionID(), students.getStudentID());
			}
		}
			
		}
	@Test
	public void testChangeMajor() throws PersonException {
		Date birthDate = new Date(1960, 1, 1);
		Student student1 = new Student("FirstName", "MiddleName", "LastName", birthDate, eMajor.PHYSICS, "Address",
				"(555)-555-5555", "Email");
		student1.setMajor(eMajor.CHEM);
		Enum expectedValue = eMajor.CHEM;
		Enum actualValue = student1.getMajor();
		assertEquals(expectedValue, actualValue);
	}
	}