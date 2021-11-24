package com.xworkz.internet;

public class InternetAirtel implements Internet {

	@Override
	public boolean connect() {
		System.out.println("invoked Airtel connect");
		return true;
	}

	@Override
	public void disConnect() {
		System.out.println("invoked disConnect");

	}

	@Override
	public int speed() {
		System.out.println("invoked Airtel speed");
		return 135;
	}

}
