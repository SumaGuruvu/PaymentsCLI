package com.payments;

import java.util.Date;

public class users {
	
	String FirstName;
	String LastName;
	long PhoneNo;
	Date DateOfBirth;
	String Adrress;
	String Password;
	double CurWalBal;
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
	public String getAdrress() {
		return Adrress;
	}
	public void setAdrress(String adrress) {
		Adrress = adrress;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public double getCurWalBal() {
		return CurWalBal;
	}
	public void setCurWalBal(double curWalBal) {
		CurWalBal = curWalBal;
	}
	

}
