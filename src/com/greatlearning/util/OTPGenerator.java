package com.greatlearning.util;

public class OTPGenerator {

	public static int generateOTP()
	{
		return((int)(Math.random()*8000) +1000);  
	}
}
