package com.htc.xml.main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.htc.xml.jaxb.StudentTy;
import com.htc.xml.jaxb.StudentsTy;

public class WritingJAXBDemo {
	public static void main(String[] args) throws FileNotFoundException {
		try {
			JAXBContext context=JAXBContext.newInstance("com.htc.xml.jaxb");
			Marshaller marshaller=context.createMarshaller();
			
			
			StudentsTy students=new StudentsTy();
			List<StudentTy> studentList=students.getStudent();
			
			StudentTy student=new StudentTy();
			student.setStudentid("s126");
			student.setStudentname("Ria");
			student.setCourse("Android");
			
			
			studentList.add(student);
			marshaller.setProperty("jaxb.formatted.output", Boolean.TRUE);
			marshaller.marshal(students, new FileOutputStream("studentdatail.xml",true));
			System.out.println("Serialized");
			
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
