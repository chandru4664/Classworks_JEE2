package com.htc.dao;

import com.htc.dao.exception.InsufficientAccountBalanceException;
import com.htc.model.Account;

public interface BankDao {
	public abstract void withdraw(Account fromAccount,Account toAccount,Double amount) throws InsufficientAccountBalanceException;
	public abstract void deposit(Account fromAccount,Account toAccount,Double amount);
}
