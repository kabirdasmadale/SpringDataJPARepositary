package com.BikkadIT.SpringBootDatajpaJPARepositary.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="User")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="UID")
	private int id;
	
	@Column(name="UFNAME")
	private String fname;
	
	@Column(name="ULNAME")
	private String Lname;
	
	@Column(name="UADDRESS")
	private String address;
	
	@Column(name="UPAN")
	private String pan;
	
	@Column(name="UAGE")
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fname=" + fname + ", Lname=" + Lname + ", address=" + address + ", pan=" + pan
				+ ", age=" + age + "]";
	}
	

}
