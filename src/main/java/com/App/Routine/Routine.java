package com.App.Routine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="routine")
public class Routine {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	String id;
	String day;
	String period;
	int roomNo;
	public Routine( String day, String period, int roomNo) {
		super();
		//this.id = id;
		this.day = day;
		this.period = period;
		this.roomNo = roomNo;
	}
	
	public Routine() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	

	
}
