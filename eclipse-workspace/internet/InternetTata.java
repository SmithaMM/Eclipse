package com.xworkz.internet;

public class InternetTata implements Internet {

	@Override
	public boolean connect() {
		System.out.println("invoked Tata connect");
		return true;
	}

	@Override
	public void disConnect() {
		System.out.println("invoked disConnect");

	}

	@Override
	public int speed() {
		System.out.println("invoked Tata speed");
		return 50;
	}

}
