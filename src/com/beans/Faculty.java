package com.beans;

public class Faculty {
	
	private String facultyID;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String emailId;
	private String courseId;
	
	
	public Faculty() {
		super();
	}
	
	public Faculty(String facultyID, String firstName, String lastName, String userName, String password,
			String emailId, String courseId) {
		super();
		this.facultyID = facultyID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.emailId = emailId;
		this.courseId = courseId;
	}

	public String getFacultyID() {
		return facultyID;
	}
	public void setFacultyID(String facultyID) {
		this.facultyID = facultyID;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	
	
	

}
