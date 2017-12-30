package com.htc.day8.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultsetDemo {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Connection con;
	Statement st;
	ResultSet rs;
	Class.forName("org.postgresql.Driver");
	con=DriverManager.getConnection("jdbc:postgresql://172.16.50.14:5432/sample_db","postgres","password@123");
	System.out.println("connected to db");
	st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
	
	rs=st.executeQuery("select * from student");
	System.out.println("3rd record");
	rs.absolute(3);
	System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
	
	System.out.println("1st record");
	rs.first();
	System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
	
	System.out.println("last record");
	rs.last();
	System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
	
	
	System.out.println("reverse record");
	while(rs.previous())
	{
		System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
	}
	
	ResultSetMetaData rsd=rs.getMetaData();
	System.out.println(rsd.getColumnCount());
	System.out.println(rsd.getColumnName(2));
	
}
}
