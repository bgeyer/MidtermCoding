package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private Double Grade;
	
	private void Enrollment() {
		EnrollmentID = UUID.randomUUID();
	}

	public Enrollment(UUID sectionID, UUID studentID) {
		super();
		EnrollmentID = UUID.randomUUID();
		SectionID = sectionID;
		StudentID = studentID;
	}

	public void setGrade(Double grade) {
		Grade = grade;
	}

	public UUID getSectionID() {
		return SectionID;
	}

	public UUID getStudentID() {
		return StudentID;
	}

	public UUID getEnrollmentID() {
		return EnrollmentID;
	}

	public Double getGrade() {
		return Grade;
	}
}
