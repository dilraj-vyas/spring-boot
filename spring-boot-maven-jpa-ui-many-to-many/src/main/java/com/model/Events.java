package com.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "events")
public class Events {

	@Id
	@GeneratedValue
	private int eventId;
	private String eventName;

	/*@JsonIgnore
	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "personEvent", joinColumns = { @JoinColumn(name = "eventId") }, inverseJoinColumns = {
			@JoinColumn(name = "pId") })*/
	@ManyToMany(mappedBy="events")
	private Collection<Person> persons=new ArrayList<Person>();

	public Events() {
	}

	
	
	public Events(String eventName) {
		super();
		this.eventName = eventName;
	}

	
	
	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public Collection<Person> getPersons() {
		return persons;
	}

	public void setPersons(Collection<Person> persons) {
		this.persons = persons;
	}
	
	
	
	
}
