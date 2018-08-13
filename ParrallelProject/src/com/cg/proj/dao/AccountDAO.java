package com.cg.proj.dao;

import com.cg.proj.beans.Account;
import com.cg.proj.exception.AccountException;

public interface AccountDAO {

	//for the create account function
		int createAccount(Account account);
		
		//for the show balance function
		double showBalance(String number) throws AccountException;
		
		//for the deposit function
		int deposit(String number, double amount) throws AccountException;
		
		//for the withdrawl function
		int withdrawl(String number, double amount) throws AccountException;
		
		//for the fund transfer function
		int fundTransfer(String number1, String number2, double fund) throws AccountException;
		
		//for the print transaction function
		int printTransaction(String number)throws AccountException;
}
