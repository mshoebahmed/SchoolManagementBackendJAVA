package com.SchoolManagement.Model;

import org.springframework.stereotype.Component;

@Component 
public class Teacher extends Person {

	protected String subject;
	
	protected String grade;
	
	protected String section;
	
	

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

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
		this.rollNo = "t-"+rollNo;
	}
	
	
	
}
