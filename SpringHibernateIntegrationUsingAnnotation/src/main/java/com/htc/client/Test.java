package com.htc.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.htc.dao.EmployeeDAO;
import com.htc.model.Employee;

public class Test {

	public static void main(String[] args) {

	ApplicationContext ctx=new ClassPathXmlApplicationContext("Beans.xml");
	EmployeeDAO dao=(EmployeeDAO) ctx.getBean("employeeDAO");
	
	/*Employee employee=new Employee();
			employee.setEmployeeId(100);
			employee.setEmployeeName("mahi");
	employee.setEmail("mahi@gmail.com");
	employee.setSalary(67890.89);
	employee.setGender("male");;
	//dao.createEmployee(employee);
*/	
	
	System.out.println(dao.getEmployeeById(100));
	
	//dao.updateEmployeeEmailById("msDhoni@gmail.com", 100);
	
	
	}

}
