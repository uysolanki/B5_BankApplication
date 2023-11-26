package com.greatlearning.service;

import java.util.Scanner;

import com.greatlearning.util.OTPGenerator;

public class BankingServiceImpl implements BankingService{

	double balance=1000;   
	@Override
	public double checkBalance() {
	return this.balance;
	}

	@Override
	public boolean Deposit(double amount)
	{
		if(amount>0)
		{
		this.balance=this.balance+amount;
		return true;
		}
		else
		{
			System.out.println("Please enter Valid Amount");
			return false;
		}
	}

	@Override
	public boolean Withdrawal(double amount) { 
		if(balance>=amount && amount>0 )
		{
			this.balance=this.balance-amount;
			return true;
		}
		else
		{
			System.out.println("Not able to process");	
			return false;
		}
		
	}

	@Override
	public boolean Transfer() {
		int smsOTP=OTPGenerator.generateOTP(); //1376
		System.out.println("Generated OTP  :"+ smsOTP);
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter OTP");  //1376
		int userOTP=sc.nextInt();
		if(smsOTP==userOTP)
		{
			System.out.println("Please enter Amount to Transer");
			long tAmt=sc.nextLong();
			if(this.balance>=tAmt)
			{
				this.balance=this.balance-tAmt;
				return true;
			}
			else
			{
				return false;
			}
			
		}
		else
		{
			System.out.println("OTP not matching");
			return false;
		}
	}

}
