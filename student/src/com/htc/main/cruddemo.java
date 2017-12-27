package com.htc.main;

import java.util.logging.Logger;

import com.htc.crud.Exception.DuplicateStudentIdFound;
import com.htc.crud.dao.StudentDAOImpl;
import com.htc.crud.dao.studentDAO;
import com.htc.crud.entity.College;
import com.htc.crud.entity.Student;

public class cruddemo {
	
	public static void main(String arg[]){
		Logger logger = Logger.getLogger(cruddemo.class.getName());
		College college = new College("srm1","srm university",null);
		Student student = new Student("s1","loknath","ECE");
		studentDAO dao = new StudentDAOImpl();
		boolean flag;
		try {
			flag = dao.addStudent(student);
		}
		catch(DuplicateStudentIdFound dse) {
			logger.warning(dse.getMessage());
		}
	}

}
