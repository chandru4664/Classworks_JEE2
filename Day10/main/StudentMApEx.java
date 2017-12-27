package com.htc.Day10.main;

import java.util.HashMap;
import com.htc.Day10.entity.Student;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.htc.Day10.entity.Marks;
import com.htc.Day10.entity.Student;

public class StudentMApEx {
Map<Student,List<Marks>> studentmap=new HashMap<>();
	public void addStudentAndmarks(Student s,List<Marks> m)
	{
		studentmap.put(s, m);
		//System.out.println(studentmap);
	}
	
	public double getAverage()
	{
		double total = 0,avg = 0;
		for(Map.Entry<Student, List<Marks>> entry:studentmap.entrySet())
		{
		List<Marks> marks=entry.getValue();
	for (Marks m : marks) {
		total+=m.getScore();
					}
	
	avg=total/marks.size();
		}
		return avg;
	}
	
	public Map<Student,List<Marks>> showrecord()
	{
		return studentmap;
	}
}
