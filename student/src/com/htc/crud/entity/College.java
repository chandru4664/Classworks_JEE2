package com.htc.crud.entity;

import java.util.Map;

public class College {
private String collegeCode;
private String collegeName;
Map<String,Student> students;//HAs-A
public String getCollegeCode() {
	return collegeCode;
}
public void setCollegeCode(String collegeCode) {
	this.collegeCode = collegeCode;
}
public String getCollegeName() {
	return collegeName;
}
public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}
public Map<String, Student> getStudents() {
	return students;
}
public void setStudents(Map<String, Student> students) {
	this.students = students;
}
public College() {
	super();
}
public College(String collegeCode, String collegeName, Map<String, Student> students) {
	super();
	this.collegeCode = collegeCode;
	this.collegeName = collegeName;
	this.students = students;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((collegeCode == null) ? 0 : collegeCode.hashCode());
	result = prime * result + ((collegeName == null) ? 0 : collegeName.hashCode());
	result = prime * result + ((students == null) ? 0 : students.hashCode());
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
	College other = (College) obj;
	if (collegeCode == null) {
		if (other.collegeCode != null)
			return false;
	} else if (!collegeCode.equals(other.collegeCode))
		return false;
	if (collegeName == null) {
		if (other.collegeName != null)
			return false;
	} else if (!collegeName.equals(other.collegeName))
		return false;
	if (students == null) {
		if (other.students != null)
			return false;
	} else if (!students.equals(other.students))
		return false;
	return true;
}
@Override
public String toString() {
	return "College [collegeCode=" + collegeCode + ", collegeName=" + collegeName + ", students=" + students + "]";
}


}
