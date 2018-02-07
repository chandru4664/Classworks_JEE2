package com.htc.spring4.exception;

public class NotEnoughMoneyException extends RuntimeException {
private String errorMessage;
	
	public NotEnoughMoneyException(){
		errorMessage = "Available money is not enought to withdraw";
	}
	public NotEnoughMoneyException(String errorMessage){
		this.errorMessage = errorMessage;
	}
	
	public String toString(){
		return errorMessage;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	
}
