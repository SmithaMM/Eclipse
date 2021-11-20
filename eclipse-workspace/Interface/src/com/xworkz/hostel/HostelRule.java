package com.xworkz.hostel;

public class HostelRule implements Hostel {

	public boolean admission() {
		System.out.println("invoked admission");
		return true;
	}

	public double closeTime() {
		System.out.println("invoked closeTime");
		return 6.30;
	}

	public String gender() {
		System.out.println("invoked gender");
		return "FEMALE";
	}

}
