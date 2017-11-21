package com.cisco.dao;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity(name = "cstudents")
@PrimaryKeyJoinColumn(name = "sid")
public class CurrentStudent extends Student {
	private double feeBal;
	private String timing;
	private String branch;

	public CurrentStudent() {
		// TODO Auto-generated constructor stub
	}

	public CurrentStudent(double feeBal, String timing, String branch) {
		super();
		this.feeBal = feeBal;
		this.timing = timing;
		this.branch = branch;
	}

	public double getFeeBal() {
		return feeBal;
	}

	public void setFeeBal(double feeBal) {
		this.feeBal = feeBal;
	}

	public String getTiming() {
		return timing;
	}

	public void setTiming(String timing) {
		this.timing = timing;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

}
