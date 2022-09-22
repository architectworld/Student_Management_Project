package com.example.demo.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String fName;
	
	private String lName;
	
	private long mobileNo;
	
	private String emialId;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String fName, String lName, long mobileNo, String emialId) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.mobileNo = mobileNo;
		this.emialId = emialId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmialId() {
		return emialId;
	}

	public void setEmialId(String emialId) {
		this.emialId = emialId;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fName=" + fName + ", lName=" + lName + ", mobileNo=" + mobileNo + ", emialId="
				+ emialId + "]";
	}
	
	
	

}
