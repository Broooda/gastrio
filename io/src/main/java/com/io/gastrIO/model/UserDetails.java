package com.io.gastrIO.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class UserDetails {

	@Id
	@GeneratedValue(generator = "UserDetails_SEQUENCE")
	@SequenceGenerator(name = "UserDetails_SEQUENCE", sequenceName = "UserDetails_SEQ")
	private int id;

	@NotNull
	@NotEmpty
	@Column(length = 30)
	private String firstName;

	@NotNull
    @NotEmpty
	@Column(length = 30)
	private String lastName;

	public UserDetails(String firstName, String lastName,
			Date birthDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}

	@Past
	private Date birthDate;

    public int getIdUser() {
        return id;
    }

	public UserDetails() {

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

    public String getIdentity() {
        return firstName + " " + lastName;
    }

	public int getId() {
		return id;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

}