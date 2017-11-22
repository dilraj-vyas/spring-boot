package com.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="CSTU")
public class CurrentStudent extends Student {
	private double feeBal;
	private String timing;
	private String branch;

	public CurrentStudent() {
		// TODO Auto-generated constructor stub
	}

	public CurrentStudent(String sname, String city, String status,
			double totalFee, double feeBal, String timing, String branch) {
		super(sname, city, status, totalFee);
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
