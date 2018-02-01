package com.htc.dao;

import com.htc.exception.InsufficientAccountBalanceException;
import com.htc.model.Account;

public interface BankDAO {

	public abstract void withdraw(Account fromAccount,Double withdrawAmt) throws InsufficientAccountBalanceException;
	public abstract void deposit(Account toAccount,Double depositAmt);
}
