package com.htc.crud.Exception;

public class StudentNotFoundException  extends Exception{
	String msg;

	public StudentNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentNotFoundException(String msg) {
		super();
		this.msg = msg;
	}
	public String getMessage()
	{
		return msg;
	}

}
