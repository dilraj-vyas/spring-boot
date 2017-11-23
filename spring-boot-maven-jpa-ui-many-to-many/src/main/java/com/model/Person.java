package com.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity(name = "person")
public class Person {

	@Id
	@GeneratedValue
	private int pId;
	private String name;
	private Long mobileNo;

	/*@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "personEvent", joinColumns = { @JoinColumn(name = "pId") }, inverseJoinColumns = {
			@JoinColumn(name = "eventId") })*/
	@ManyToMany(cascade= CascadeType.ALL)
	private Collection<Events> events=new ArrayList<Events>();
	public Person(String name, Long mobileNo) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
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
		return events;
	}

	public void setEvents(Collection<Events> events) {
		this.events = events;
	}

}
