package com.htc.day8.DAO;

import java.util.List;

import com.htc.day8.entity.Student;

public interface StudentDAO {
boolean storeStudent(Student st) throws ClassNotFoundException;
boolean updateStudent(String id,String crs);
List<Student> getStudentsbycrs(String crs);
void storeStudents(List<Student> students);
}
