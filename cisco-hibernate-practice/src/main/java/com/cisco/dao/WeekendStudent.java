package com.cisco.dao;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity(name = "westudents")
@PrimaryKeyJoinColumn(name = "sid")
public class WeekendStudent extends CurrentStudent {

	private String wcompany;
	private String wcemail;
	private double wctc;

	public WeekendStudent() {
	}

	public String getWcompany() {
		return wcompany;
	}

	public void setWcompany(String wcompany) {
		this.wcompany = wcompany;
	}

	public String getWcemail() {
		return wcemail;
	}

	public void setWcemail(String wcemail) {
		this.wcemail = wcemail;
	}

	public double getWctc() {
		return wctc;
	}

	public void setWctc(double wctc) {
		this.wctc = wctc;
	}

}
