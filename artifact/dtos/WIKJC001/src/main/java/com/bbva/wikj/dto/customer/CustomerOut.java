package com.bbva.wikj.dto.customer;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The ExampleDTO class...
 */
public class CustomerOut implements Serializable  {

	private String id;

	private String customerId;
	private String info;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@java.lang.Override
	public java.lang.String toString() {
		return "ExampleDTO{" +
				"id='" + id + '\'' +
				", customerId='" + customerId + '\'' +
				", info='" + info + '\'' +
				'}';
	}
}
