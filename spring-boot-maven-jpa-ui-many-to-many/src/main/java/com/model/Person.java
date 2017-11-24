package com.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "person")
public class Person {
	
	
	@Id
	@GeneratedValue
	private int pId;
	private String name;
	private Long mobileNo;

	/*@JoinTable(name = "personEvent", joinColumns = { @JoinColumn(name = "pId") }, inverseJoinColumns = {
			@JoinColumn(name = "eventId") })*/
	@ManyToMany(cascade= CascadeType.ALL)
	@JsonIgnore
	private Collection<Events> events;
	
	public Person(String name, Long mobileNo) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, Long mobileNo, Collection<Events> events) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.events = events;
	}



	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Collection<Events> getEvents() {
	System.out.println("get All Events Called");
		return events;
	}

	public void setEvents(Collection<Events> events) {
		this.events = events;
	}

}
