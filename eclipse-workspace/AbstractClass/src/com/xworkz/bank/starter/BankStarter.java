package com.xworkz.bank.starter;

import com.xworkz.bank.Bank;
import com.xworkz.bank.hdfc.HdfcBank;
import com.xworkz.bank.icici.IciciBank;

public class BankStarter {

	public static void main(String[] args) {
		
		Bank bank=new IciciBank("ICICI_BANK", "ICIC0004284");

		bank.provideLoan();
		bank.openAccount();
		bank.closeAccount();

		String name=bank.getName();

		System.out.println(name);

		String ifsc=bank.getIfscCode();

		System.out.println(ifsc);


		Bank bank1=new HdfcBank("HDFC","HDFC0004284");

		bank1.closeAccount();
		bank1.openAccount();
		bank1.provideLoan();

		String set=bank1.getName();


		System.out.println(set);

		String code=bank1.getIfscCode();

		System.out.println(code);


	}

	}


