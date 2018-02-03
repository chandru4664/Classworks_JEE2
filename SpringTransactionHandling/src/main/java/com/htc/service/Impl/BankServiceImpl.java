package com.htc.service.Impl;

import com.htc.dao.BankDao;
import com.htc.dao.exception.InsufficientAccountBalanceException;
import com.htc.model.Account;
import com.htc.service.BankService;

public class BankServiceImpl implements BankService {
	
	private BankDao bankDao;
	
	public void setBankDao(BankDao bankDao) {
		this.bankDao = bankDao;
	}
	
	public BankDao getBankDao() {
		return bankDao;
	}

	public void transferFund(Account fromAccount, Account toAccount,
			Double amount) throws InsufficientAccountBalanceException {
		getBankDao().withdraw(fromAccount, toAccount, amount);
		getBankDao().deposit(fromAccount, toAccount, amount);
	}
}
