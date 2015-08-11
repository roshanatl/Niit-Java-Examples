package com.niit.Jdbc;

public class Account {
	@Override
	public String toString() {
		return "Account [Name=" + firstName + ", email=" + email +", phone=" + phone + ", IdNumber=" + IdNumber + "]";
	}

	private String firstName;
	private String lastName;
	private String IdNumber;
	private String email;
	private String phone;
	private String pwd;
	
	

	public Account(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

	}

	public Account() {

	}

	public String getName() {
		return firstName + lastName;
	}
	
	public void setName(String name) {
		firstName = name;
	}

	public String getIdNumber() {
		return IdNumber;
	}

	public void setIdNumber(String idNumber) {
		IdNumber = idNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	

}
