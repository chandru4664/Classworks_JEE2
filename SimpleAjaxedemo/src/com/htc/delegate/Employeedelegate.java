package com.htc.delegate;

import java.sql.SQLException;

import javax.naming.NamingException;

import com.htc.dao.Employee;
import com.htc.dao.EmployeeDAO;
import com.htc.dao.EmployeeDAOImpl;

public class Employeedelegate {
EmployeeDAO dao;
	public Employeedelegate() {
		// TODO Auto-generated constructor stub
		dao=new EmployeeDAOImpl();
		
	}
	
	public Employee getEmpByID(int eid) 
	{
		Employee e=null;
		try {
			 e=dao.getEmployee(eid);
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		
		return e;
	}
	
	
	public boolean storeEmp(Employee e)
	
	{
		
		boolean flag=false;
		int d=0;
		try {
			d=dao.storeEmployee(e);
			if(d>0)
				flag=true;
		} catch (NamingException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return flag;
	}
	
}
