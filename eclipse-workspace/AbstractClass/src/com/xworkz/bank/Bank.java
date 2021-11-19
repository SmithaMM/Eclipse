package com.xworkz.bank;

public abstract class Bank {
	public String name;
	public String ifscCode;

	public Bank(String name, String ifscCode) {
		super();
		this.name = name;
		this.ifscCode = ifscCode;
	}

	public abstract void provideLoan();

	public abstract void openAccount();

	public abstract void closeAccount();

	public String getName() {
		System.out.println("Invoked getName");
		return this.name;
	}

	public String getIfscCode() {
		System.out.println("Invoked getIfscCode");
		return this.ifscCode;
	}

}
