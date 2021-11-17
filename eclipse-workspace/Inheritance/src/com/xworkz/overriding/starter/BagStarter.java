package com.xworkz.overriding.starter;

import com.xworkz.overriding.Bag;
import com.xworkz.overriding.Color;

public class BagStarter {

	public static void main(String[] args) {

		Bag bag = new Bag();
		bag.setColor(Color.GREEN);
		bag.setPrice(2000);

		Bag bag1 = new Bag();
		bag1.setColor(Color.GRAY);
		bag1.setPrice(5000);

		bag.equals(bag1);

	}

}
