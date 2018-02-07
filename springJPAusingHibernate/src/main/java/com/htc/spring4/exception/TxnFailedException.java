package com.htc.spring4.exception;

public class TxnFailedException extends RuntimeException {

	private String errorMessage;
	
	public TxnFailedException(){
		errorMessage = "Transaction Failed";
	}
	public TxnFailedException(String errorMessage){
		this.errorMessage = errorMessage;
	}
	
	public String toString(){
		return errorMessage;
	}
	

}
