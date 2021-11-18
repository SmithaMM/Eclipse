package com.xworkz.overriding.starter;

import com.xworkz.overriding.Stadium;

public class StadiumStarter {

	public static void main(String[] args) {

		Stadium stadium = new Stadium();
		stadium.setName("Narendra Modi Stadium");
		stadium.setCity("Motera, Ahmedabad, Gujarat, India");
		stadium.setAreaInMeters(132000);

		Stadium stadium1 = new Stadium();
		stadium1.setName("Narendra Modi Stadium");
		stadium1.setCity("Motera, Ahmedabad, Gujarat, India");
		stadium1.setAreaInMeters(132000);

		stadium.equals(stadium1);

	}

}
