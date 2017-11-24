package com.hbm.model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="N2N_PERSON")
public class Person {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="P_ID")
	private Integer id;

	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JsonIgnore
	//	@JoinTable(name = "MIDDLE", joinColumns = { @JoinColumn(name = "P_ID") }, inverseJoinColumns = { @JoinColumn(name = "A_ID") })
	private Collection<Address> addresses;

	
	public Person(){
		
	}
	
	public Person(String name, Collection<Address> addresses) {
		super();
		this.name = name;
		this.addresses = addresses;
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<Address> getSet() {
		return addresses;
	}

	public void setSet(Collection<Address> set) {
		this.addresses = set;
	}
}
