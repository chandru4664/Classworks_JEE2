package com.htc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE_TABLE")
public class Employee implements Serializable  {

	@Id
	//@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="employee_id")
	private int employeeId;
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", email=" + email
				+ ", salary=" + salary + ", gender=" + gender + "]";
	}
	@Column(name="employee_name")
	private String employeeName;
	
	@Column(name="email")
	private String email;
	
	public Employee() {}
	
	public Employee(int employeeId, String employeeName, String email, Double salary, String gender) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.email = email;
		this.salary = salary;
		this.gender = gender;
	}
	@Column(name="salary")
	private Double salary;
	@Column(name="gender")
	private String gender;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
