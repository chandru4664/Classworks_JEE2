package com.htc.day8.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.htc.day8.DAO.StudentDAO;
import com.htc.day8.DAO.StudentDAOImpl;
import com.htc.day8.entity.Student;

public class TestStudentdao {
public static void main(String[] args) throws IOException {
	InputStreamReader in=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(in);
	/*System.out.println("Enter the student id");
	String id=br.readLine();*/
	/*System.out.println("enter the name");
	String name=br.readLine();*/
	System.out.println("enter the course");
	String crs=br.readLine();
	//Student s=new Student(id,name,crs);
	StudentDAO dao=new StudentDAOImpl();
	/*if(dao.storeStudent(s))
	{
		System.out.println("data stored successfully");
	}*/
	/*if(dao.updateStudent(id, crs))
	{
		System.out.println("updated");
	}*/
	List<Student> stlist=dao.getStudentsbycrs(crs);
	for (Student student : stlist) {
		System.out.println(student.getStudentid()+"\t"+student.getStudentname());
		
		
	}
}
}
