package com.SchoolManagement.Model;

public abstract class Person {

	
	protected String firstName;
	protected String middleName;
	protected String lastName;
	protected String sex;
	protected String address;
	protected String dob;
	protected String motherName;
	protected String mothertongue;
	public String rollNo;
    public String email;
    @SuppressWarnings("unused")
	private String password;
    public String department;
    
    //email
    //password
  
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getMothertongue() {
		return mothertongue;
	}
	public void setMothertongue(String mothertongue) {
		this.mothertongue = mothertongue;
	}
	
	public abstract String getRollNo();
	
	public abstract void setRollNo(String rollNo);
	
	
    public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
}
