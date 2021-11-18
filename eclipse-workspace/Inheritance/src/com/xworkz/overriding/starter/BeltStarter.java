package com.xworkz.overriding.starter;

import com.xworkz.overriding.Belt;

public class BeltStarter {

	public static void main(String[] args) {

		Belt belt = new Belt();
		belt.setMaterial("Leather");
		belt.setPrice(800);
		belt.setSize(28);
		belt.setGender("FEMALE");

		Belt belt1 = new Belt();
		belt1.setMaterial("Leather");
		belt1.setPrice(2500);
		belt1.setSize(30);
		belt1.setGender("FEMALE");

		belt.equals(belt1);

	}

}
