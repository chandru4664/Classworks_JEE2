package com.htc.day8.main;

import java.util.ArrayList;
import java.util.List;

import com.htc.day8.DAO.StudentDAO;
import com.htc.day8.DAO.StudentDAOImpl;
import com.htc.day8.entity.Student;

public class BatchDemo {
public static void main(String[] args) {
	List<Student> stuList=new ArrayList<Student>();
	stuList.add(new Student("s10445","ravina","Android"));
	stuList.add(new Student("s10488","Sadhana","oracle"));
	stuList.add(new Student("s10491","smith","AWS"));
	StudentDAO dao=new StudentDAOImpl();
	dao.storeStudents(stuList);
}
}
