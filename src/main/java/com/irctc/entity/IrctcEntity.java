package com.irctc.entity;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "IRCTC")
public class IrctcEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IRCTC_ID")
	protected int irctcId;
	@Column(name = "F_NAME")
	protected String fName;
	@Column(name = "L_NAME")
	protected String lName;
	@Column(name = "GENDER")
	protected String gender;
	@Column(name = "DOB")
	protected Date dob;
	@Column(name = "EMAIL_ID")
	protected String emailId;
	@Column(name = "MOBILE_NO")
	protected BigInteger mobileNo;
	@Column(name = "USERNAME")
	protected String username;
	@Column(name = "PASSWORD")
	protected String password;

	public int getIrctcId() {
		return irctcId;
	}

	public void setIrctcId(int irctcId) {
		this.irctcId = irctcId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public BigInteger getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(BigInteger mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
