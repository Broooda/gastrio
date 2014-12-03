package com.io.gastrIO.form;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class RegisterForm {

	@Size(min=1, max=30, message="Błędne imie")
    private String fname;

	@Size(min=1, max=30, message="Błędne nazwisko")
    private String lname;

	@Size(min=1, max=2, message="Zła data")
	private int day;

    @Size(min=1, max=2, message="Zła data")
	private int month;

	@Size(min=1, max=2, message="Zła data")
	private int year;

	@Email(message="Błędny email")
	private String email;

    @NotEmpty(message = "Brak hasła")
    @Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,20})", message="Błędne hasło")
	private String password;


    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public int getDay() {
        return day;
    }


    public void setDay(int day) {
        this.day = day;
    }


    public int getMonth() {
        return month;
    }


    public void setMonth(int month) {
        this.month = month;
    }


    public int getYear() {
        return year;
    }


    public void setYear(int year) {
        this.year = year;
    }

}
