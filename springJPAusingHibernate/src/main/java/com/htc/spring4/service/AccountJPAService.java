package com.htc.spring4.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.htc.spring4.dao.AccountDAO;

public class AccountJPAService {
	AccountDAO accountDAO;
	
	public AccountJPAService(AccountDAO dao) {
		this.accountDAO=dao;
	}

	@Transactional(propagation=Propagation.REQUIRED,rollbackFor=java.lang.Exception.class)
	public boolean deposit(String toAccno,double amount) {
				return accountDAO.deposit(toAccno, amount);
			}
	
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor=com.htc.spring4.exception.NotEnoughMoneyException.class)
	public boolean withdraw(String fromAccno,double amount) {
		return accountDAO.withdraw(fromAccno, amount);
	}
	
	@Transactional(propagation=Propagation.REQUIRES_NEW,rollbackFor=com.htc.spring4.exception.TransferFailedException.class)
	public boolean transferMoney(String fromAccno,String toAccno,double amount) {
		return accountDAO.transfer(fromAccno, toAccno, amount);
	}
	
}
