package com.htc.spring4.exception;

public class TransferFailedException extends RuntimeException {
private String errorMessage;
	
	public TransferFailedException(){
		errorMessage = "Transaction Failed";
	}
	public TransferFailedException(String errorMessage){
		this.errorMessage = errorMessage;
	}
	
	public String toString(){
		return errorMessage;
	}
	

}
