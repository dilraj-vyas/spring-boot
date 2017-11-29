package com.kafka.serialize;

import java.util.Date;

import org.apache.kafka.common.serialization.StringSerializer;

public class Supplier {
	private int supplierId;
	private String supplierName;
	private String supplierStartDate;

	public Supplier() {

	}

	public Supplier(int supplierId, String supplierName, String supplierStartDate) {
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.supplierStartDate = supplierStartDate;
		
	}

	public int getSupplierId() {
		return supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public String getSupplierStartDate() {
		return supplierStartDate;
	}

}
