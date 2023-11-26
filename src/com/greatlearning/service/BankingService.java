package com.greatlearning.service;

public interface BankingService {
	double checkBalance();
	boolean Deposit(double amount);
	boolean Withdrawal(double amount);
	boolean Transfer();
}
