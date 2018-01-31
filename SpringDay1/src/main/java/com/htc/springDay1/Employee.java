package com.htc.springDay1;

public class Employee {
String employeeid;
public String getEmployeeid() {
	return employeeid;
}
public void setEmployeeid(String employeeid) {
	this.employeeid = employeeid;
}
public String getEmployeename() {
	return employeename;
}
public void setEmployeename(String employeename) {
	this.employeename = employeename;
}
public double getSalary() {
	return salary;
}
@Override
public String toString() {
	return "Employee [employeeid=" + employeeid + ", employeename=" + employeename + ", salary=" + salary + "]";
}
public void setSalary(double salary) {
	this.salary = salary;
}
String employeename;
double salary;
}
