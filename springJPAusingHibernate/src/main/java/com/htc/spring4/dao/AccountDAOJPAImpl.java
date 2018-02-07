package com.htc.spring4.dao;

import javax.persistence.EntityManager;


import javax.persistence.PersistenceContext;

import com.htc.spring4.beans.Account;
import com.htc.spring4.exception.NotEnoughMoneyException;
import com.htc.spring4.exception.TransferFailedException;

public class AccountDAOJPAImpl implements AccountDAO {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public boolean deposit(String toAccno, Double amount) {
		boolean dd= false;
		Account account=em.find(Account.class,toAccno);
		if(account!= null) {
			account.setBalance(account.getBalance()+amount);
			dd=true;
		}
		else {
			throw new RuntimeException();
		}
		return dd;
	}

	@Override
	public boolean withdraw(String fromAccno, Double amount) throws NotEnoughMoneyException {
		boolean wd=false;
		Account account = em.find(Account.class,fromAccno);
		if(account!=null) {
			account.setBalance(account.getBalance()-amount);
			wd=true;
		}
		else {
			throw new NotEnoughMoneyException();
		}
		return wd;
	}

	@Override
	public boolean transfer(String fromAccno, String toAccno, Double amount) throws TransferFailedException  {
		boolean flag=false;
		boolean wd=withdraw(fromAccno,amount);
		boolean dd = deposit(toAccno,amount);
		if(!wd && dd)
		{
			throw new TransferFailedException();
		}
		
			
			
			return flag; 
			
	}
	
}













