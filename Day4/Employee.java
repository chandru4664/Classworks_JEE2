package com.htc.day2.entity;

public class Employee {
	 private String employeeid;//instance variable
	private String employeename;//instance variable
	private double salary;//instance variable
	private String deptno;//instance variable
	public static int count;//static variable
	
	static		//static block
	{
		count=2;
	}
	
	public Employee()   //default constructor
	{
		count++;
		
	}
	
	public Employee(String employeeid, String employeename, double salary, String deptno) //parameterized constructor
	{
		count++; 
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.salary = salary;
		this.deptno = deptno;
		
	}
	public String getEmployeeid() //getter method or accessor
	{
		return employeeid;
	}
	public void setEmployeeid(String employeeid)//use to modify ,setter method or mutator method
	{
	this.employeeid = employeeid;// this keyword used to refer current object
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) 
	{
		this.employeename = employeename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary)
	{
		double netsalary;
		this.salary = salary;
	}
	public String getDeptno() {
		return deptno;
	}
	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", employeename=" + employeename + ", salary=" + salary
				+ ", deptno=" + deptno + "]";
	}
	
	
	

}
