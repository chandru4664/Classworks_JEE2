package com.htc.crud.dao;

import java.util.HashMap;
import java.util.Map;

import com.htc.crud.Exception.DuplicateStudentIdFound;
import com.htc.crud.Exception.StudentNotFoundException;
import com.htc.crud.entity.College;
import com.htc.crud.entity.Student;

public class StudentDAOImpl implements studentDAO {
	
	private Map<String,Student> studentlist=new  HashMap<>();

	@Override
	public boolean addStudent(Student s) throws DuplicateStudentIdFound {
		boolean flag=false;
		if(studentlist.containsKey(s.getStudentId())) {
			throw new DuplicateStudentIdFound("Please change the student");
		}
		studentlist.put(s.getStudentId(), s);
		flag= true;
		
		return flag;
		
	}

	@Override
	public boolean updateStudent(String studentid,String studentname) throws StudentNotFoundException {
		boolean flag=false;
		if(!studentlist.containsKey(studentid)) {
			throw new StudentNotFoundException("Student ID not available. Please change the student");
		}
		studentlist.get(studentid).setStudentName(studentname);
		//studentlist.replace(studentid, new Student(studentname, studentid, ""));
		flag= true;
		
		
		return flag;
	}

	@Override
	public boolean removeStudent(String studentid) throws StudentNotFoundException {
		boolean flag=false;
		if(!studentlist.containsKey(studentid)) {
			throw new StudentNotFoundException("Student ID not available. Please change the student");
		}
		studentlist.remove(studentid);
		flag= true;
		
		
		return flag;
	}

	@Override
	public Map<String, Student> getStudents(String collegeId) {
		// TODO Auto-generated method stub
		return studentlist;
	}

	@Override
	public Student getStudentbyId(String studentId) throws StudentNotFoundException {
		if(!studentlist.containsKey(studentId)) {
			throw new StudentNotFoundException("Student ID not available. Please change the student");
		}
		
		return studentlist.get(studentId);
	}

}
