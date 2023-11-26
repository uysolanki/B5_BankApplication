package com.greatlearning.app;

import java.util.Scanner;

import com.greatlearning.model.Customer;
import com.greatlearning.service.BankingServiceImpl;

public class BankApplication {

	public static void main(String[] args) {
	Customer c1=new Customer(18,"Virat@123");	
	BankingServiceImpl bank=new BankingServiceImpl();
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Please enter your Account Number");
	long accNo=sc.nextLong(); //18
	
	System.out.println("Please enter your Account Password");
	String accPwd=sc.next(); //virat@123
	
	int choice;
	if(accNo==c1.getAccountNumber() && accPwd.equals(c1.getPassword()))
	{
		System.out.println("Login Successful, Welcome to Indian Bank ATM");
		do
		{
			System.out.println("****BANKING MENU*****");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Transef");
			System.out.println("5. Exit");
			
			System.out.println("Please enter your Choice : ");
			choice=sc.nextInt(); //1
			switch(choice)
			{
			case 1:  	double balance=bank.checkBalance();
						System.out.println("Balance : "+balance);
						break;
						
			case 2:  	System.out.println("Please enter Deposit Amount ");
						long dAmt=sc.nextLong(); //500
						boolean dStatus=bank.Deposit(dAmt);
						if(dStatus==true)
							System.out.println("Deposit Successful");
						else
							System.out.println("Deposit Not Successful");
						break;
			case 3:  	System.out.println("Please enter Withdrwal Amount ");
						long wAmt=sc.nextLong();
						boolean wStatus=bank.Withdrawal(wAmt);
						if(wStatus==true)
							System.out.println("Withdrawal Successful");
						else
							System.out.println("Withdrawal Not Successful");
						break;
			case 4:		boolean tStatus=bank.Transfer();  
						if(tStatus==true)
							System.out.println("Transfer Successful");
						else
							System.out.println("Transfer Not Successful");
						break;
			case 5:  	System.exit(0);
			default: System.out.println("Please enter valid choice"); 
			}
			
		}while(choice!=5);
		
	}
	else
	{
		System.out.println("Login Not Successful, Please enter valid credentials");
	}
	
	
	
	
	

	}

}
