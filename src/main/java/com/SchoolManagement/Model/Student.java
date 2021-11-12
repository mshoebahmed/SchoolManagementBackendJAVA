package com.SchoolManagement.Model;

public class Student extends Person {

	protected String grade;
	
	protected String section;
	
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = "s-"+rollNo;
	}
	
}
