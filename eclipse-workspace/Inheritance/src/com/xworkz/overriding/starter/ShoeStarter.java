package com.xworkz.overriding.starter;

import com.xworkz.overriding.Shoe;

public class ShoeStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shoe shoe = new Shoe();
		shoe.setBrand("WoodLand");
		shoe.setColor("black");
		shoe.setGender("Men");

		Shoe shoe1 = new Shoe();
		shoe1.setBrand("WoodLand");
		shoe1.setColor("brown");
		shoe1.setGender("Men");

		shoe.equals(shoe1);

	}

}
