package com.htc.day8.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
public static Connection getConnection()
{
	Connection con=null;
			try
	{
				Class.forName("org.postgresql.Driver");
				
				
				con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","123Welcome");
				System.out.println("connected to db");
	}
	catch(Exception ex)
	{
		ex.printStackTrace();
	}
	return con;
}
}
