package com.htc.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.htc.dao.BankDao;
import com.htc.dao.exception.InsufficientAccountBalanceException;
import com.htc.dao.mapper.AccountRowMapper;
import com.htc.model.Account;

public class BankDaoImpl implements BankDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void withdraw(Account fromAccount, Account toAccount, Double amount) throws InsufficientAccountBalanceException {
		Account accountFromDb = getAccountFromDb(fromAccount.getAccountNumber());
		
		Double accountBalance = accountFromDb.getAccountBalance()-amount;
		if(accountFromDb.getAccountBalance()>=amount){
			String SQL="UPDATE icicibank set account_balance=? WHERE account_no=?";
			int update = getJdbcTemplate().update(SQL, accountBalance,fromAccount.getAccountNumber());
			if(update>0){
				System.out.println("Amount Rs:"+amount+" is tranferred from Account No:"+fromAccount.getAccountNumber() +" to Account No:"+toAccount.getAccountNumber());
			}
		}else{
			throw new InsufficientAccountBalanceException("Insufficient account balance");
		}
	}

	public void deposit(Account fromAccount, Account toAccount, Double amount) {
		Account accountFromDb = getAccountFromDb(toAccount.getAccountNumber());
		Double accountBalance = accountFromDb.getAccountBalance()+amount;
		String SQL="UPDATE icicibank set account_balance=? WHERE account_no=?";
		int update = getJdbcTemplate().update(SQL, accountBalance,toAccount.getAccountNumber());
		if(update>0){
			System.out.println("Amount Rs:"+amount+" is deposited in Account No:"+toAccount.getAccountNumber());
			//throw new RuntimeException();
		}
		else
		{
			throw new RuntimeException();
		}
		
	}
	
	private Account getAccountFromDb(Long accountNumber) {
		String SQL ="SELECT * FROM icicibank WHERE account_no = ?";
		Account account = getJdbcTemplate().queryForObject(SQL,new AccountRowMapper(), accountNumber);
		return account;
	}

}
