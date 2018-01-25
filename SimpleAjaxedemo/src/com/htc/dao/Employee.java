package com.htc.dao;

public class Employee {
private int employeeid;
private String employeename;
private double salary;
private String job;

public Employee(int employeeid, String employeename, double salary, String job) {
	super();
	this.employeeid = employeeid;
	this.employeename = employeename;
	this.salary = salary;
	this.job = job;
}
public int getEmployeeid() {
	return employeeid;
}
public void setEmployeeid(int employeeid) {
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
public void setSalary(double salary) {
	this.salary = salary;
}
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Employee [employeeid=" + employeeid + ", employeename=" + employeename + ", salary=" + salary + ", job="
			+ job + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + employeeid;
	result = prime * result + ((employeename == null) ? 0 : employeename.hashCode());
	result = prime * result + ((job == null) ? 0 : job.hashCode());
	long temp;
	temp = Double.doubleToLongBits(salary);
	result = prime * result + (int) (temp ^ (temp >>> 32));
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
	Employee other = (Employee) obj;
	if (employeeid != other.employeeid)
		return false;
	if (employeename == null) {
		if (other.employeename != null)
			return false;
	} else if (!employeename.equals(other.employeename))
		return false;
	if (job == null) {
		if (other.job != null)
			return false;
	} else if (!job.equals(other.job))
		return false;
	if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
		return false;
	return true;
}


}
