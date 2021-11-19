package com.xworkz.bank.icici;

import com.xworkz.bank.Bank;

public class IciciBank extends Bank{
	
	public IciciBank(String name, String ifscCode) {
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
