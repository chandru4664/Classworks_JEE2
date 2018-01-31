package com.htc.spring4.beans;

public class Student {

	private String regno;
	private String studentName;
	
	private Address address;
	private College college;
	
	public Student() {}
	public Student(String regno, String studentName, Address address,
			College college) {
		super();
		this.regno = regno;
		this.studentName = studentName;
		this.address = address;
		this.college = college;
	}
	public String getRegno() {
		return regno;
	}
	public void setRegno(String regno) {
		this.regno = regno;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	
	
}
