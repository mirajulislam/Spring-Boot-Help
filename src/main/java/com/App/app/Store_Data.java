package com.App.app;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="batch")
public class Store_Data {
@Id
	
	private String batchName;
	
	private String coursename;
	
	private String facultyname;

	
	public Store_Data() {
	
	}

	public Store_Data(String batchName, String coursename, String facultyname) {
		super();
		this.batchName = batchName;
		this.coursename = coursename;
		this.facultyname = facultyname;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public String getFacultyname() {
		return facultyname;
	}

	public void setFacultyname(String facultyname) {
		this.facultyname = facultyname;
	}
	
	

}
