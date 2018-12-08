package com.beans;

public class Student {
	private String universityID;
	private String firstName;
	private String lastName;
	private String password;
	private String emailId;
	private String userName;
	public String getUniversityID() {
		return universityID;
	}
	public void setUniversityID(String iD) {
		universityID = iD;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Student() {
		super();
	}
	public Student(String iD, String firstName, String lastName, String password, String emailId, String userName) {
		super();
		universityID = iD;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.emailId = emailId;
		this.userName = userName;
	}
	
	

}
