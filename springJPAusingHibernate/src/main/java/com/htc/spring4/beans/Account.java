package com.htc.spring4.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ACCOUNT")
public class Account {
	
	
	@Id
	@Column
	private String accno;
	
	@Column
	private String accHolderName;
	
	@Column
	private Double balance;
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Account() {
		super();
	}
	public Account(String accno, String accHolderName, Double balance) {
		super();
		this.accno = accno;
		this.accHolderName = accHolderName;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", accHolderName=" + accHolderName + ", balance=" + balance + "]";
	}
	
	
	

}
