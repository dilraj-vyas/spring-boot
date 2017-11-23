package com.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String cname;
	private Long mobileNo;

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private Collection<Address> addresses;

	public Customer(String cname, Long mobileNo) {
		this.cname = cname;
		this.mobileNo = mobileNo;
	}

	public Customer(String cname, Long mobileNo, Collection<Address> addresses) {
		this.cname = cname;
		this.mobileNo = mobileNo;
		this.addresses = addresses;
	}

	public Customer() {
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Collection<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Collection<Address> addresses) {
		this.addresses = addresses;
	}

}
