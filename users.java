package com.payments;

import java.util.Date;

public class users {
	
	String FirstName;
	String LastName;
	long PhoneNo;
	Date DateOfBirth;
	String Email;
	String Password;
	String Address;
	double Currbal;
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	public long getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		PhoneNo = phoneNo;
	}
	public Date getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public double getCurrbal() {
		return Currbal;
	}
	public void setCurrbal(double currbal) {
		Currbal = currbal;
	}
	
	

}