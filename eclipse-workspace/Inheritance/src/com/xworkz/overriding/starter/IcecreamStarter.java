package com.xworkz.overriding.starter;

import com.xworkz.overriding.Flavour;
import com.xworkz.overriding.Icecream;

public class IcecreamStarter {

	public static void main(String[] args) {

		Icecream icecream = new Icecream();
		icecream.setName("Cone Icecream");
		icecream.setFlavour(Flavour.VANILLA);

		Icecream icecream1 = new Icecream();
		icecream1.setName("Cone Icecream");
		icecream1.setFlavour(Flavour.STAWBERRIES);

		icecream.equals(icecream1);

	}

}
