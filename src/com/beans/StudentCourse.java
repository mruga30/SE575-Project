package com.beans;

public class StudentCourse {
	
	private String universityID;
	private String courseId1;
	private String courseId2;
	private String courseId3;
	
	
	public StudentCourse() {
		super();
	}


	public StudentCourse(String universityID, String courseId1, String courseId2, String courseId3) {
		super();
		this.universityID = universityID;
		this.courseId1 = courseId1;
		this.courseId2 = courseId2;
		this.courseId3 = courseId3;
	}


	public String getUniversityID() {
		return universityID;
	}


	public void setUniversityID(String universityID) {
		this.universityID = universityID;
	}


	public String getCourseId1() {
		return courseId1;
	}


	public void setCourseId1(String courseId1) {
		this.courseId1 = courseId1;
	}


	public String getCourseId2() {
		return courseId2;
	}


	public void setCourseId2(String courseId2) {
		this.courseId2 = courseId2;
	}


	public String getCourseId3() {
		return courseId3;
	}


	public void setCourseId3(String courseId3) {
		this.courseId3 = courseId3;
	}
	
	

}
