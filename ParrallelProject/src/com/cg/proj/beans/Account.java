package com.cg.proj.beans;

public class Account {

	//Attributes
	private String name;
	private String number;
	private double balance;
	private String emailid;
	private String password;
	private String username;
	
	//Default constructor
	public Account()
	{
		
	}
	
	//parameterized constructor
	public Account(String name, String number, String username, String password, double balance, String emailid)
	{
		this.name = name;
		this.number = number;
		this.username = username;
		this.password = password;
		this.balance = balance;
		this.emailid = emailid;
	}

	
	//getters and setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	
}
