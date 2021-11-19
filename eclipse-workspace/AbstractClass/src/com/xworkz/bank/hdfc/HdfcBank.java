package com.xworkz.bank.hdfc;
import com.xworkz.bank.Bank;

public class HdfcBank extends Bank{
	
	public HdfcBank(String name, String ifscCode) {
		super(name,ifscCode);
	}

	
	public void provideLoan()
	{
		System.out.println("Invoked provide loan");
	}
	
	public void openAccount()
	{
		System.out.println("Invoked Open Account");
	}

	
	public void closeAccount() {
		
		System.out.println("Invoked Close Account");
	}

}
