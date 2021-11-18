package com.xworkz.overriding.starter;

import com.xworkz.overriding.Food;

public class FoodStarter {

	public static void main(String[] args) {

		Food food = new Food();
		food.setName("Idli");
		food.setPrice(50);
		food.setQuantity(5);
		food.setQuality(true);

		Food food1 = new Food();
		food1.setName("Masala Dosa");
		food1.setPrice(50);
		food1.setQuantity(5);
		food1.setQuality(true);

		food.equals(food1);
	}

}
