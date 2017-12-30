package com.htc.day8.entity;

public class Student {
String Studentid;
String studentname;
String course;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(String studentid, String studentname, String course) {
	super();
	Studentid = studentid;
	this.studentname = studentname;
	this.course = course;
}
public String getStudentid() {
	return Studentid;
}
public void setStudentid(String studentid) {
	Studentid = studentid;
}
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
@Override
public String toString() {
	return "Student [Studentid=" + Studentid + ", studentname=" + studentname + ", course=" + course + "]";
} 
}
