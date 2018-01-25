package com.htc.dao;

import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeDAOImpl implements EmployeeDAO{

	
	public Employee getEmployee(int eid) 
	{
		Employee e=null;
		Connection con = null;
		try
		{
			InitialContext ctx=new InitialContext();
			DataSource ds=(DataSource)ctx.lookup("java:comp/env/jdbc/user");
			 con=ds.getConnection();
			PreparedStatement ps=con.prepareStatement("select empid,empname,salary,job from employee where empid=?");
			ps.setInt(1, eid);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				int id=rs.getInt(1);
				String ename=rs.getString(2);
				double salary=rs.getDouble(3);
				
				String job=rs.getString(4);
				 e=new Employee(id,ename,salary,job);
			}
			
			
		}
		catch(SQLException se )
		{
			se.printStackTrace();
		} catch (NamingException ee) {
			// TODO Auto-generated catch block
			ee.printStackTrace();
		}
	
		
		
		return e;
		
	}

	@Override
	public int storeEmployee(Employee e) throws SQLException, NamingException {
		// TODO Auto-generated method stub
		Connection con;
		PreparedStatement ps;
		Context ctx=new InitialContext();
		DataSource ds=(DataSource) ctx.lookup("java:comp/env/jdbc/user");
		con=ds.getConnection();
		ps=con.prepareStatement("insert into employee values(?,?,?,?,? )");
		/*ps.setInt(1, e.getEmployeeid());
		ps.setString(2, e.getEmployeename());
		ps.(3, e.getSalary());
		ps.setInt(4, e.getCommision());
		ps.setInt(5, e.getDepartmentid());
		int i=ps.executeUpdate();*/
		return 0;
	}
}
