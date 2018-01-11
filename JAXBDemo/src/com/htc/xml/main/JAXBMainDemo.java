package com.htc.xml.main;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.util.List;

import com.htc.xml.jaxb.StudentTy;
import com.htc.xml.jaxb.StudentsTy;

public class JAXBMainDemo {
public static void main(String[] args) {
	JAXBContext context = null;
	try {
		context = JAXBContext.newInstance("com.htc.xml.jaxb");
	} catch (JAXBException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Unmarshaller unmarshaller = null;
	try {
		unmarshaller = context.createUnmarshaller();
	} catch (JAXBException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	JAXBElement<StudentsTy> root = null;
	try {
		root = (JAXBElement<StudentsTy>) 
				unmarshaller.unmarshal(new File("student.xml"));
	} catch (JAXBException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	StudentsTy rootele=root.getValue();
		

	List<StudentTy> studentList=rootele.getStudent();
	
	for (StudentTy student : studentList) {
		System.out.println("Student id"+student.getStudentid());
		System.out.println("Student Name"+student.getStudentname());
		System.out.println("Student course"+student.getCourse());
		System.out.println("+++++++++++++++++++++++++++++++++++++");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
