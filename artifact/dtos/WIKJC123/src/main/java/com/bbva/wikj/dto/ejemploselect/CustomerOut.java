package com.bbva.wikj.dto.ejemploselect;

import java.io.Serializable;

/**
 * The ExampleDTO class...
 */
public class CustomerOut implements Serializable  {
	private String id;

	private String nuip;
	private String fullName;
	private String phone;
	private String address;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNuip() {
		return nuip;
	}

	public void setNuip(String nuip) {
		this.nuip = nuip;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


}
