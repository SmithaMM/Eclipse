package com.xworkz.hospital;

public class HospitalRule implements Hospital {

	public String register() {
		System.out.println("invoked register");
		return "Registered";
	}

	public double payAdvance() {
		System.out.println("invoked payAdvance");
		return 10000;
	}

	public boolean validInsurance() {
		System.out.println("invoked validInsurance");
		return true;
	}
}
