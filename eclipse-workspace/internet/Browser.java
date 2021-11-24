package com.xworkz.internet;

public class Browser {
	private Internet internet;

	public Browser(Internet internet) {
		System.out.println("invoked Browser with Internet");
		this.internet = internet;
	}

	public void browse() {
		System.out.println("invoked browser");
		if (internet != null) {
			if (internet.connect() == true && internet.speed() > 1) {
				System.out.println("Internet connected");
			} else {
				this.internet.disConnect();
			}

		}
	}

}
