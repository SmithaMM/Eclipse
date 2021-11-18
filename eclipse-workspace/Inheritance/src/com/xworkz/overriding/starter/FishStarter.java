package com.xworkz.overriding.starter;

import com.xworkz.overriding.Fish;

public class FishStarter {

	public static void main(String[] args) {

		Fish fish = new Fish();
		fish.setColor("SILVER");
		fish.setName("Pamplet");
		fish.setPrice(850);

		Fish fish1 = new Fish();
		fish1.setColor("SILVER");
		fish1.setName("Pamplet");
		fish1.setPrice(850);

		fish.equals(fish1);

	}

}
