package com.htc.day3.main;

import java.util.Scanner;

import com.htc.day2.entity.Employee;

public class EbjectArrayDemo {
	public static void main(String[] args) {
		Employee[] employees=new Employee[3];
		Scanner s=new Scanner(System.in);
		for (int i = 0; i < employees.length; i++) {
			System.out.println("enter employeeid");
			String id=s.next();
			System.out.println("enter employeename");
			String name=s.next();
			System.out.println("enter salary");
			double salary=s.nextDouble();
			System.out.println("enter deptno");
			String dept=s.next(); 
			employees[i]=new Employee(id,name,salary,dept);
			
		}
		
		int i=1;
		for (Employee emp : employees) {
			
			System.out.println("object "+i);
			System.out.println(emp.getEmployeeid());
			System.out.println(emp.getEmployeename());
			System.out.println(emp.getSalary());
			System.out.println(emp.getDeptno());
			i++;
			
		}
		
		
		
	}

}
