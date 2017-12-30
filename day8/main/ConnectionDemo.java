package com.htc.day8.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.htc.day8.DAO.ConnectDB;

public class ConnectionDemo {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Connection con;
	Statement st;
	ResultSet rs;
	/*Class.forName("org.postgresql.Driver");
	con=DriverManager.getConnection("jdbc:postgresql://172.16.50.14:5432/sample_db","postgres","password@123");
	System.out.println("connected to db");*/
	con=ConnectDB.getConnection();
	st=con.createStatement();
	/*int i=st.executeUpdate("insert into student values('s10056','Diya','Android')");
	if(i>0)
		System.out.println("data stored successfully");*/
	rs=st.executeQuery("select student_id,student_name,course from student");
	System.out.println(rs);
	/*while(rs.next())
	{
		System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3));
	}*/
	con.close();
}
}
