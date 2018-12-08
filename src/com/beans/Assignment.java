package com.beans;

import java.util.*;

public class Assignment {

	private String courseId;
	private String topic;
	private String description;
	private String date;
	private String time;
	
	
	public Assignment() {
		super();
	}

	public Assignment(String topic, String description, String date,String courseId,String time) {
		super();
		this.topic = topic;
		this.description = description;
		this.date = date;
		this.courseId = courseId;
		this.time = time;
		
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
	
	
}
