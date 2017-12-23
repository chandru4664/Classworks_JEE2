package com.htc.Day7.Enitity;

public class AgeNotVAlidException extends Exception {
String cause;
	public AgeNotVAlidException()
	{
		this.cause="Age is not valid";
	}
	
	public AgeNotVAlidException(String cause)
	{
		this.cause=cause;
	}

	@Override
	public String toString() {
		return "AgeNotVAlidException [cause=" + cause + "]";
	}
	
	public String getMessage()
	{
		return cause;
	}
	
}
