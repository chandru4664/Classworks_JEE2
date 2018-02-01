package com.htc.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.htc.model.Account;

public class AccountRowMapper implements RowMapper<Account> {

	@Override
	public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
		Account account = new Account();
		account.setAccountNumber(rs.getLong("account_no"));
		account.setAccountHolderName(rs.getString("account_holdername"));
		account.setAccountBalance(rs.getDouble("account_balance"));
		account.setAccounType(rs.getString("account_type"));
		return account;
	}


}
