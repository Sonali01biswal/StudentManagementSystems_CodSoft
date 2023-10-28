package com.codSoft.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private int sid;
	private String name;
	private String password;
	private String email;
	private long phoneNo;
	private String gender;
	private String address;
	private String city;
	private String state;
	public Student() {
		super();
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Student(int sid, String name, String password, String email, long phoneNo, String gender, String address,
			String city, String state) {
		super();
		this.sid = sid;
		this.name = name;
		this.password = password;
		this.email = email;
		this.phoneNo = phoneNo;
		this.gender = gender;
		this.address = address;
		this.city = city;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", password=" + password + ", email=" + email + ", phoneNo="
				+ phoneNo + ", gender=" + gender + ", address=" + address + ", city=" + city + ", state=" + state + "]";
	}
}
