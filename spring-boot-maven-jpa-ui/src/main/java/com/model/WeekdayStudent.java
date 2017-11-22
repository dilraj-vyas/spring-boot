package com.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity(name = "wdstudents")
@PrimaryKeyJoinColumn(name = "sid")
public class WeekdayStudent extends CurrentStudent {

	private String qualification;
	private String percentage;
	private int yoe;

	public WeekdayStudent() {
		// TODO Auto-generated constructor stub
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	public int getYoe() {
		return yoe;
	}

	public void setYoe(int yoe) {
		this.yoe = yoe;
	}

}
