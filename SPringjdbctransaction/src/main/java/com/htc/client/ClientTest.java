package com.htc.client;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.htc.exception.InsufficientAccountBalanceException;
import com.htc.model.Account;
import com.htc.service.BankService;
import com.htc.serviceImpl.BankServiceImpl;

public class ClientTest {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
		
		BankService bankService = (BankService) context.getBean("bankService");
		
		Account fromAccount=new Account();
		fromAccount.setAccountNumber(112233L);
		
		Account toAccount=new Account();
		toAccount.setAccountNumber(227788L);
		
		try {
			bankService.transferFund(fromAccount, toAccount, 1000.00);
		} catch (InsufficientAccountBalanceException e) {
			System.out.println(e.getMessage());
		}
		
		((AbstractApplicationContext) context).close();
	}

}
