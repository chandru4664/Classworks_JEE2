package com.htc.springDay1;

import java.util.List;

public class Department {
	
	int departmentid;
	String departmentname;
	List<Employee> employees;
	public int getDepartmentid() {
		return departmentid;
	}
	
	public String getDepartmentname() {
		return departmentname;
	}
	
	
	
	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Department(int departmentid,String departmentname)
	{
		this.departmentid=departmentid;
		this.departmentname=departmentname;
	}
	
	public void displayinfo()
	{
		
		System.out.println("Department object created for "+getDepartmentid()+":"+getDepartmentname());
		for (Employee employee : employees) {
			
		
	
		System.out.println("contains"+employee);
		}
}
}
