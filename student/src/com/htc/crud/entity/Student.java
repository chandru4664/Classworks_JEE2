package com.htc.crud.entity;

public class Student {
private String studentName;
private String studentId;
private String studentDept;
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentId() {
	return studentId;
}
public void setStudentId(String studentId) {
	this.studentId = studentId;
}
public String getStudentDept() {
	return studentDept;
}
public void setStudentDept(String studentDept) {
	this.studentDept = studentDept;
}
public Student(String studentName, String studentId, String studentDept) {
	super();
	this.studentName = studentName;
	this.studentId = studentId;
	this.studentDept = studentDept;
}
public Student() {
	super();
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((studentDept == null) ? 0 : studentDept.hashCode());
	result = prime * result + ((studentId == null) ? 0 : studentId.hashCode());
	result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
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
	if (studentDept == null) {
		if (other.studentDept != null)
			return false;
	} else if (!studentDept.equals(other.studentDept))
		return false;
	if (studentId == null) {
		if (other.studentId != null)
			return false;
	} else if (!studentId.equals(other.studentId))
		return false;
	if (studentName == null) {
		if (other.studentName != null)
			return false;
	} else if (!studentName.equals(other.studentName))
		return false;
	return true;
}
@Override
public String toString() {
	return "Student [studentName=" + studentName + ", studentId=" + studentId + ", studentDept=" + studentDept + "]";
}


}
