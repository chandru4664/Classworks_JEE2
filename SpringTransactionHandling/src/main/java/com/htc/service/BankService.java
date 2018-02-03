package com.htc.service;

import com.htc.dao.exception.InsufficientAccountBalanceException;
import com.htc.model.Account;

public interface BankService {
	public abstract void transferFund(Account fromAccount,Account toAccount,Double amount)throws InsufficientAccountBalanceException;
}
