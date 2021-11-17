package com.xworkz.overriding.starter;

import com.xworkz.overriding.Headset;
import com.xworkz.overriding.TypeHeadset;

public class HeadsetStarter {

	public static void main(String[] args) {

		Headset headset = new Headset();
		headset.setBrand("BoAt");
		headset.setBattery(10);
		headset.setType(TypeHeadset.WIRED);
		headset.setWarranty("one year");

		Headset headset1 = new Headset();
		headset1.setBrand("SAMSUNG");
		headset1.setBattery(10);
		headset1.setType(TypeHeadset.WIRED);
		headset1.setWarranty("one year");

		headset.equals(headset1);

	}

}
