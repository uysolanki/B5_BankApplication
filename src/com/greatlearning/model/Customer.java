package com.greatlearning.model;

public class Customer {
//readable  best parctices you followed while coding
	private long accountNumber;
	private String password;
	
	public Customer() //no args constructor
	{}
	public Customer(long accountNumber, String password)//para cos
	{
		this.accountNumber = accountNumber;
		this.password = password;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
}
