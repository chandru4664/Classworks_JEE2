package com.htc.day8.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import com.htc.day8.entity.Student;

public class StudentDAOImpl implements StudentDAO{
	Connection con;
	//Statement st;
	PreparedStatement pst;
	ResultSet rs;
	
	@Override
	public boolean storeStudent(Student st) throws ClassNotFoundException  {
		boolean flag=false;
		try {
		con=ConnectDB.getConnection();
		
			pst=con.prepareStatement("insert into student values(?,?,?)");
			
			pst.setString(1, st.getStudentid());
			pst.setString(2, st.getStudentname());
			pst.setString(3, st.getCourse());
			int i=pst.executeUpdate();
			if(i>0)
				flag=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
	@Override
	public boolean updateStudent(String id, String crs) {
		boolean flag=false;
		try {
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection("jdbc:postgresql://172.16.50.14:5432/sample_db","postgres","password@123");
			System.out.println("connected to db");
			pst=con.prepareStatement("update  student set course=? where studentid=?");
			pst.setString(1,crs);
			pst.setString(2,id);
			
			int i=pst.executeUpdate();
			if(i>0)
				flag=true;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
		
	}
	@Override
	public List<Student> getStudentsbycrs(String crs) {
		
		List<Student> result = new ArrayList<>();
		try {
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection("jdbc:postgresql://172.16.50.14:5432/sample_db","postgres","password@123");
			System.out.println("connected to db");
			pst=con.prepareStatement("select studentid,studentname,course from student where course=? ");
			pst.setString(1, crs);
			
			
	rs=pst.executeQuery();
	while(rs.next()){
	result.add(new Student(rs.getString(1),rs.getString(2),rs.getString(3)));
	}
	
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	@Override
	public void storeStudents(List<Student> students) {
	
	
		//boolean flag=false;
		try {
			con=ConnectDB.getConnection();
			pst=con.prepareStatement("insert into student values(?,?,?)");
			for(Student st:students)
			{
			pst.setString(1, st.getStudentid());
			pst.setString(2, st.getStudentname());
			pst.setString(3, st.getCourse());
			pst.addBatch();
			}
			
			/*pst.setString(1, "s1098");
			pst.setString(2, "Ishikka");
			pst.setString(3, "Testing");
			pst.addBatch();
			
			pst.setString(1, "s1095");
			pst.setString(2, "usha");
			pst.setString(3, "php");
			pst.addBatch();*/

int i[]=pst.executeBatch();
System.out.println(i.length+"rows affected");
pst.close();
con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
