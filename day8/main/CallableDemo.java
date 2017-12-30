package com.htc.day8.main;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import com.htc.day8.DAO.ConnectDB;

public class CallableDemo {
public static void main(String[] args) throws SQLException {
	Connection con;
	Statement st;
	ResultSet rs;
	/*try {
		Class.forName("org.postgresql.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	con=ConnectDB.getConnection();
			//DriverManager.getConnection("jdbc:postgresql://localhost:5432/shopping","openpg","openpgpwd");
	//System.out.println("connected to db");
	
	CallableStatement cst=con.prepareCall("{?=call storestudent(?,?,?)}");
	
	cst.registerOutParameter(1,Types.INTEGER);
	
	cst.setString(2, "s1010");
	cst.setString(3, "nithya");
	cst.setString(4, "Android");
	cst.execute();
	int i=cst.getInt(1);
	if(i>0)
	{
		System.out.println("successfully inserted");
	}
	
}
}
