package com.bbva.wikj.dto.ejemplo;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class DtoOut implements Serializable  {
	private String name;
	private String surname;
	public String getName() {
		return this.name;
	}
	public void setName(final String name) {
		this.name = name;
	}
	public String getSurname() {
		return this.surname;
	}
	public void setSurname(final String surname) {
		this.surname = surname;
	}
	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("name", name)
			.append("surname", surname)
			.toString();
	}
}
