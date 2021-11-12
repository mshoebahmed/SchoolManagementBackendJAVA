package com.SchoolManagement.SchoolManagement;

import java.util.Scanner;

import com.SchoolManagement.Model.Student;
import com.SchoolManagement.Service.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DevRun {

	@Autowired
	Service service;
	

    int selection = 0;
	String inputData = null;

	public String backEndRun() {
		System.out.println("1. Student");
		selection = 1;
		String returnStmt = " ";
		switch (selection) {
		case 1: {
			System.out.println("1.Add");
			selection = 1;
			
			returnStmt =  secondCase("Student", selection);
			break;
		}
		default: {
			
			System.out.println("Please Choose the Option Correctly");
			backEndRun();

		}
		}
		return returnStmt;
		
	}

	public String secondCase(String person, int option) {
		String returnStmt = " ";
		switch (option) {
		case 1: {
			returnStmt =  addPerson(person);
			break;
		}
		default: {
			System.out.println("Please Choose the Option Correctly");
			backEndRun();

		}

		}
		return returnStmt;

	}

	public String addPerson(String person) {
		Student psn = null;
		String returnStatment = " ";
		if (person.equalsIgnoreCase("Student")) {
			psn = new Student();
		}
		if (psn != null) {
			System.out.println("Enter String for First Name");
			inputData = "Mirza";
			psn.setFirstName(inputData);

			System.out.println("Enter String for Middle Name");
			inputData = "Shoeb";
			psn.setMiddleName(inputData);

			System.out.println("Enter String for Last Name");
			inputData = "Ahmed";
			psn.setLastName(inputData);

			System.out.println("Enter String for Mother's Name");
			inputData = "SOfia Taj";
			psn.setMotherName(inputData);

			System.out.println("Enter String for Mother Tongue");
			inputData = "Urdu";
			psn.setMothertongue(inputData);

			System.out.println("Enter String for Date Of Birth");
			inputData = "8 june 1996";
			psn.setDob(inputData);

			System.out.println("Enter String for Address");
			inputData = "Hyderabad";
			psn.setAddress(inputData);

			System.out.println("Enter String for Gender");
			inputData = "M";
			psn.setSex(inputData);

			System.out.println("Enter String for Class");
			inputData = "10";
			psn.setGrade(inputData);

			System.out.println("Enter String for Section");
			inputData = "A";
			psn.setSection(inputData);

			System.out.println("Enter String for Roll No.");
			inputData = "1";
			psn.setRollNo(inputData);
			
			System.out.println("Enter 1 to post sql");
			selection =1;
			if (selection == 1) {
				returnStatment =  service.addStudent(psn);
			}

			
		}

		return returnStatment;

	}

}
