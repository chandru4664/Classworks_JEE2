package com.htc.serviceImpl;

import com.htc.dao.BankDAO;
import com.htc.exception.InsufficientAccountBalanceException;
import com.htc.model.Account;
import com.htc.service.BankService;


public class BankServiceImpl implements BankService {

	private BankDAO bankDAO;
	
	public void setBankDAO(BankDAO bankDAO) {
		this.bankDAO = bankDAO;
	}
	
	public BankDAO getBankDAO() {
		return bankDAO;
	}
	
	@Override
	public void transferFund(Account fromAccount, Account toAccount, Double amount) throws InsufficientAccountBalanceException {
		getBankDAO().withdraw(fromAccount, amount);
		getBankDAO().deposit(toAccount, amount);
	}
}
