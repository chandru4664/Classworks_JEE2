package com.htc.crud.Exception;

public class DuplicateStudentIdFound extends Exception {
 String msg;

public DuplicateStudentIdFound() {
	super();
	// TODO Auto-generated constructor stub
}

public DuplicateStudentIdFound(String msg) {
	super();
	this.msg = msg;
}
 public String getMessage()
 {
	 return msg;
 }
}
