package com.cg.proj.service;

import com.cg.proj.beans.Account;
import com.cg.proj.exception.AccountException;

public interface AccountService {

	//for the create account function
	int createAccount(Account account);
	
	//for the show balance function
	double showBalance(String number) throws AccountException;
	
	//for the deposit function
	int deposit(String number, double amount) throws AccountException;;
	
	//for the withdrawl function
	int withdrawl(String number, double amount) throws AccountException;;
	
	//for the fund transfer function
	int fundTransfer(String number1, String number2, double fund) throws AccountException;;
	
	//for the print transaction function
	int printTransaction(String number) throws AccountException;;
	
	//validation
	boolean validateAccount(Account account) throws AccountException;
	
}
