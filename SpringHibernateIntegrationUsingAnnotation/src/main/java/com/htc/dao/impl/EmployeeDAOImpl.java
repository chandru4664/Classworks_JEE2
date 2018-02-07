
package com.htc.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.htc.dao.EmployeeDAO;
import com.htc.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private SessionFactory sessionFactory;
	
	public EmployeeDAOImpl() {}

	public EmployeeDAOImpl (SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
	}
	
	

	public void createEmployee(Employee employee) {
		System.out.println(".###############  create()");
		Session session=sessionFactory.openSession();
employee.setEmployeeId(100);
employee.setEmployeeName("mahi");
employee.setEmail("mahi@gmail.com");
employee.setSalary(67890.89);
employee.setGender("male");;
Transaction tx=session.beginTransaction();
session.persist(employee);
tx.commit();
		System.out.println("saved **********");
		session.close();
	}

	public Employee getEmployeeById(int employeeId) {
		Session session=sessionFactory.openSession();
		Employee employee=(Employee) session.get(Employee.class,employeeId);
		return employee;
		
	}

	public void updateEmployeeEmailById(String newEmail, int employeeId) {
		Session session=sessionFactory.openSession();
		
		Transaction tx=session.beginTransaction();
		Employee e=(Employee) session.load(Employee.class,employeeId);
		e.setEmail(newEmail);
		tx.commit();
				System.out.println("updated**********");
				session.close();
	}
}

	
	