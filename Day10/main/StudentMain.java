package com.htc.Day10.main;

import java.util.ArrayList;
import java.util.List;

import com.htc.Day10.entity.Marks;
import com.htc.Day10.entity.Student;

public class StudentMain {
public static void main(String[] args) {
	
	Student s=new Student("s101","Praveen");
	List<Marks> marks=new ArrayList<>();
	marks.add(new Marks("subject1",90));
	marks.add(new Marks("subject2",85));
	marks.add(new Marks("subject3",65));
	StudentMApEx stu=new StudentMApEx();
	stu.addStudentAndmarks(s, marks);
	double avg=stu.getAverage();
	if(avg>90)
	{
		s.setGrade("outstanding");
	}
	
	else if(avg>80 && avg<=90)
	{
		s.setGrade("excellent");
	}
	else if(avg>70 && avg<=80)
	{
		s.setGrade("good");
	}
	else if(avg>60 && avg<=70)
	{
		s.setGrade("Fair");
	}
	else if(avg>50 && avg<=60)
	{
		s.setGrade("statisfactory");
	}
	else
	{
		s.setGrade("fail");
		
	}
	
	
	//System.out.println(stu.showrecord());
	System.out.println(stu.showrecord().keySet());
	
}
}
