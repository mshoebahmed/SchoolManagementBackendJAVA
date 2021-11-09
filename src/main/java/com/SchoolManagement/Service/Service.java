package com.SchoolManagement.Service;

import com.SchoolManagement.Model.Person;
import com.SchoolManagement.Model.Student;
import com.SchoolManagement.Model.Teacher;

public class Service {

	public String addStudent(Student request) { 
		
		if(request.getFirstName() != null || request.getMiddleName() != null ||request.getLastName() != null || request.getMotherName() != null ||
				request.getMothertongue() != null || request.getDob() != null || request.getAddress() != null 
				|| request.getSex() != null || request.getGrade() != null || request.getSection() != null
				|| request.getRollNo() != null) {
//			var student = new Student();
//			student.setAddress(null);
//			student.setDob(null);
//			student.setFirstName(null);
//			student.setLastName(null);
//			student.setMiddleName(null);
//			student.setMotherName(null);
//			student.setMothertongue(null);	
//			student.setSex(null);
//			student.setClassStandard(null);
//			student.setSection(null);
//			student.setRollNo(null);
			return "Sucessfully Added"+ request.getFirstName() + " "+ request.getMiddleName() + " "+ request.getLastName();
		}else {
			String missingFields = "Required (*) Fields :-";
			
			if(request.getFirstName() == null) {
				missingFields += " First Name,";
				
			}
			if(request.getMiddleName() == null ) {
				missingFields += " Middle Name,";
				
			}
			if(request.getLastName() == null ) {
				missingFields += " Last Name,";
				
			}
			if(request.getMotherName() == null) {
				missingFields += " Mother's Name,";
				
			}
			if(request.getMothertongue() == null) {
				missingFields += " Mother Tongue,";
				
			}
			if( request.getDob() == null ) {
				missingFields += " Date Of Birth,";
			}
			if(request.getAddress() == null) {
				missingFields += " Address,";
				
			}
			if(request.getSex() == null) {
				missingFields += " Gender,";
				
			}
			if( request.getGrade() == null ) {
				missingFields += " Class,";
			}
			if(request.getSection() == null) {
				missingFields += " Section,";
				
			}
			if(request.getRollNo() == null) {
				missingFields += " Roll No.,";
				
			}
			
			return missingFields + " Are Missing!" ;
		}

	}
	
public String addTeacher(Teacher request) { 
		
		if(request.getFirstName() != null || request.getMiddleName() != null ||request.getLastName() != null || request.getMotherName() != null ||
				request.getMothertongue() != null || request.getDob() != null || request.getAddress() != null 
				|| request.getSex() != null || request.getGrade() != null || request.getSection() != null
				|| request.getRollNo() != null) {
//			var student = new Student();
//			student.setAddress(null);
//			student.setDob(null);
//			student.setFirstName(null);
//			student.setLastName(null);
//			student.setMiddleName(null);
//			student.setMotherName(null);
//			student.setMothertongue(null);	
//			student.setSex(null);
//			student.setClassStandard(null);
//			student.setSection(null);
//			student.setRollNo(null);
			return "Sucessfully Added"+ request.getFirstName() + " "+ request.getMiddleName() + " "+ request.getLastName();
		}else {
			String missingFields = "Required (*) Fields :-";
			
			if(request.getFirstName() == null) {
				missingFields += " First Name,";
				
			}
			if(request.getMiddleName() == null ) {
				missingFields += " Middle Name,";
				
			}
			if(request.getLastName() == null ) {
				missingFields += " Last Name,";
				
			}
			if(request.getMotherName() == null) {
				missingFields += " Mother's Name,";
				
			}
			if(request.getMothertongue() == null) {
				missingFields += " Mother Tongue,";
				
			}
			if( request.getDob() == null ) {
				missingFields += " Date Of Birth,";
			}
			if(request.getAddress() == null) {
				missingFields += " Address,";
				
			}
			if(request.getSex() == null) {
				missingFields += " Gender,";
				
			}
			if( request.getGrade() == null ) {
				missingFields += " Class,";
			}
			if(request.getSection() == null) {
				missingFields += " Section,";
				
			}
			if(request.getRollNo() == null) {
				missingFields += " Roll No.,";
				
			}
			
			return missingFields + " Are Missing!" ;
		}

	}
	
	
}
