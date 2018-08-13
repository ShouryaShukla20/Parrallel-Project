package com.cg.proj.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.proj.beans.Account;
import com.cg.proj.exception.AccountException;

public class AccountDAOImpl implements AccountDAO{

	Map<String,Account> hash = new HashMap<>();
	
	@Override
	public int createAccount(Account account) {
		hash.put(account.getNumber(), account);
		return Integer.parseInt(account.getNumber());
	}

	@Override
	public double showBalance(String number) throws AccountException {
		if(hash.containsKey(number)) {
		return hash.get(number).getBalance();
	}
		else 
			throw new AccountException("Number not found");
	}

	@Override
	public int deposit(String number, double amount) throws AccountException {
		if(hash.containsKey(number)) {
			double initBal = hash.get(number).getBalance();
			initBal = initBal + amount;
			return (int)initBal;
		}
			else 
				throw new AccountException("Number not found");
	}

	@Override
	public int withdrawl(String number, double amount) throws AccountException {
		if(hash.containsKey(number)) {
			double initBal = hash.get(number).getBalance();
			if (initBal > amount)
			{
				initBal = initBal - amount;
				return (int)initBal;
			}
			else
				throw new AccountException("Not enough balance");
		}
		else 
				throw new AccountException("Number not found");
	}

	@Override
	public int fundTransfer(String number1, String number2, double fund) throws AccountException {
		AccountDAOImpl dao = new AccountDAOImpl();
		int bal = dao.withdrawl(number1, fund);
		int bal1 = dao.deposit(number2, fund);
		return 0;
	}

	@Override
	public int printTransaction(String number) {
		// TODO Auto-generated method stub
		return 0;
	}

}
