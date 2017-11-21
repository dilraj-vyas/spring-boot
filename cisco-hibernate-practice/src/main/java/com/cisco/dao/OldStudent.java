package com.cisco.dao;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;



@Entity(name = "ostudents")
@PrimaryKeyJoinColumn(name = "sid")
public class OldStudent  extends Student {
	private String oldCompany;
	private String ocEmail;
	private double octc;

	public OldStudent() {
		// TODO Auto-generated constructor stub
	}
	
	public String getOldCompany() {
		return oldCompany;
	}

	public void setOldCompany(String oldCompany) {
		this.oldCompany = oldCompany;
	}

	public String getOcEmail() {
		return ocEmail;
	}

	public void setOcEmail(String ocEmail) {
		this.ocEmail = ocEmail;
	}

	public double getOctc() {
		return octc;
	}

	public void setOctc(double octc) {
		this.octc = octc;
	}

}
