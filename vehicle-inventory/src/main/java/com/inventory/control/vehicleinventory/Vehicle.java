package com.inventory.control.vehicleinventory;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String type;

	public Vehicle() {
		super();
	}

	public Vehicle(Long id, String name, String type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
	}

	public Vehicle(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return String.format("Vehicle [id=%s, name=%s, type=%s]", id, name, type);
	}

}
