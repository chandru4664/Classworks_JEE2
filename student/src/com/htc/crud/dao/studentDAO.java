package com.htc.crud.dao;

import java.util.Map;

import com.htc.crud.Exception.DuplicateStudentIdFound;
import com.htc.crud.Exception.StudentNotFoundException;
import com.htc.crud.entity.Student;

public interface studentDAO {
	public boolean addStudent(Student s) throws DuplicateStudentIdFound;
	public boolean updateStudent(String studentId, String studentName) throws StudentNotFoundException;
	public boolean removeStudent(String studentId) throws StudentNotFoundException;
	public  Map<String,Student> getStudents(String collegeId);
	public Student getStudentbyId(String studentId) throws StudentNotFoundException;
}

