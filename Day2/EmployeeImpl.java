package com.htc.day2.main;

import com.htc.day2.entity.Employee;

public class EmployeeImpl {
public static void main(String[] args) {
	Employee e=new Employee("e123","xxxx",45789.98,"D456");//creating instance
	Employee e1=new Employee("e134","yyy",67890,"D345");
	Employee E3 = new Employee("e1324","zzz",78695,"D1234");
	e.setSalary(6523.78);
	
	/*e.setEmployeeid("E120");
	e.setEmployeename("Bob");
	e.setSalary(60000);
	e.setDeptno("D1290");*/
	
	System.out.println("employee id:"+e.getEmployeeid());
	System.out.println("employee name:"+e.getEmployeename());
	System.out.println("employee's salary:"+e.getSalary());
	System.out.println("employee'e dept:"+e.getDeptno());
	
	System.out.println("calling e1 object");
	System.out.println("employee id:"+e1.getEmployeeid());
	System.out.println("employee name:"+e1.getEmployeename());
	System.out.println("employee's salary:"+e1.getSalary());
	System.out.println("employee'e dept:"+e1.getDeptno());
	
	
	System.out.println("calling e3 object");
	System.out.println("employee id:"+E3.getEmployeeid());
	System.out.println("employee name:"+E3.getEmployeename());
	System.out.println("employee's salary:"+E3.getSalary());
	System.out.println("employee'e dept:"+E3.getDeptno());
	System.out.println("no of objects"+Employee.count);
}
}


