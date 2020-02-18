package com.App.Course;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="course")
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String coursename;

	
	
	
	public Course(int id, String coursename) {
		super();
		this.id = id;
		this.coursename = coursename;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getCoursename() {
		return coursename;
	}




	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}




	public Course() {
		
	}
	
	
}
