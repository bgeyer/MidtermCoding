package com.cisc181.core;

import java.util.UUID;

public class Course {
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private Enum Major;
	
	public Course() {
		CourseID = UUID.randomUUID();
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public int getGradePoints() {
		return GradePoints;
	}

	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}

	public Enum getMajor() {
		return Major;
	}

	public void setMajor(Enum major) {
		Major = major;
	}

	public UUID getCourseID() {
		return CourseID;
	}
	
}
