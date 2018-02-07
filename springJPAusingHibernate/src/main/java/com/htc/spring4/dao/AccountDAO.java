package com.htc.spring4.dao;

import com.htc.spring4.exception.TransferFailedException;

public interface AccountDAO {
	
	public boolean deposit(String toAccno,Double amount);
	public boolean withdraw(String fromAccno,Double amount);
	public boolean transfer(String fromAccno,String toAccno,Double amount) throws TransferFailedException;

}
