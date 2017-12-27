package com.htc.Day10.entity;

public class Student {
String stuid;
String stuname;
String grade;
public String getStuid() {
	return stuid;
}
public void setStuid(String stuid) {
	this.stuid = stuid;
}
public String getStuname() {
	return stuname;
}
public void setStuname(String stuname) {
	this.stuname = stuname;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(String stuid, String stuname) {
	super();
	this.stuid = stuid;
	this.stuname = stuname;
}
@Override
public String toString() {
	return "Student [stuid=" + stuid + ", stuname=" + stuname + ", grade=" + grade + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((grade == null) ? 0 : grade.hashCode());
	result = prime * result + ((stuid == null) ? 0 : stuid.hashCode());
	result = prime * result + ((stuname == null) ? 0 : stuname.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	if (grade == null) {
		if (other.grade != null)
			return false;
	} else if (!grade.equals(other.grade))
		return false;
	if (stuid == null) {
		if (other.stuid != null)
			return false;
	} else if (!stuid.equals(other.stuid))
		return false;
	if (stuname == null) {
		if (other.stuname != null)
			return false;
	} else if (!stuname.equals(other.stuname))
		return false;
	return true;
}

}
