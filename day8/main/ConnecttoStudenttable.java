package com.htc.day8.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.htc.day8.DAO.ConnectDB;

public class ConnecttoStudenttable {
	 
	public static void main(String[] args) throws SQLException {
		{
			Connection con = null;
			PreparedStatement ps;
			ResultSet rs;		
		try
		{
			con=new ConnectDB().getConnection();
		
			ps=con.prepareStatement("select studentid,studentname,course from student where course=? ");
			ps.setString(1, "php");
			rs=ps.executeQuery();
			
			while (rs.next()){
				System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3));
				
			}
		}
		catch(Exception ex){
		ex.printStackTrace();
		}
		
		finally
		{
		con.close();
			
		}	
			
		}
	}

}
