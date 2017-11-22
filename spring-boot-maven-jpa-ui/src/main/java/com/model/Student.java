package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity(name = "mystudents")
@Inheritance(strategy = InheritanceType.JOINED)
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	private String sname;
	private String city;
	private String status;
	private double totalFee;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String sname, String city, String status, double totalFee) {
		this.sname = sname;
		this.city = city;
		this.status = status;
		this.totalFee = totalFee;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(double totalFee) {
		this.totalFee = totalFee;
	}

}
