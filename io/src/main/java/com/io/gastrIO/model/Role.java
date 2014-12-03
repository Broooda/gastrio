package com.io.gastrIO.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Role {

	@GeneratedValue(generator = "Role_SEQUENCE")
	@Id
	@SequenceGenerator(name = "Role_SEQUENCE", sequenceName = "Role_SEQ")
	private int id;

	@Column(unique = true)
	private String name;

	public Role() {

	}
	public Role(String name){
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + "]";
	}

}