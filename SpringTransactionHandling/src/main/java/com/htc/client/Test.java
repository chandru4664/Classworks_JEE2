package com.htc.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.htc.dao.exception.InsufficientAccountBalanceException;
import com.htc.model.Account;
import com.htc.service.BankService;
import com.htc.service.Impl.BankServiceImpl;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		BankService bankService = ctx.getBean("bankService", BankServiceImpl.class);
		Account fromAccount = new Account();
		fromAccount.setAccountNumber(112233L);
		
		Account toAccount = new Account();
		toAccount.setAccountNumber(2027788L);
		
		try {
			bankService.transferFund(fromAccount, toAccount, 6000.00);
		} catch (InsufficientAccountBalanceException e) {
			e.printStackTrace();
		}
		
		ctx.close();

	}

}
