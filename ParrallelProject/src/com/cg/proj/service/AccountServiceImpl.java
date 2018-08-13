package com.cg.proj.service;

import com.cg.proj.beans.Account;
import com.cg.proj.dao.AccountDAO;
import com.cg.proj.dao.AccountDAOImpl;
import com.cg.proj.exception.AccountException;

public class AccountServiceImpl implements AccountService{


	AccountDAO adao = new AccountDAOImpl();

	@Override
	public int createAccount(Account account) {
		
		return adao.createAccount(account);
	}

	@Override
	public double showBalance(String number) throws AccountException {
		return adao.showBalance(number);
	}

	@Override
	public int deposit(String number, double amount) throws AccountException{
		return adao.deposit(number,amount);
	}

	@Override
	public int withdrawl(String number, double amount) throws AccountException{
		return adao.withdrawl(number, amount);
	}

	@Override
	public int fundTransfer(String number1, String number2, double fund) throws AccountException{
		return adao.fundTransfer(number1, number2, fund);
	}

	@Override
	public int printTransaction(String number) throws AccountException{
		return adao.printTransaction(number);
	}

	@Override
	public boolean validateAccount(Account account) throws AccountException {
		return false;
	}
	
}
