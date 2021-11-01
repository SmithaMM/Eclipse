package com.xworkz.dto.starter;
import com.xworkz.dto.DishDto;

public class DishStarter {
	
	public static void main(String[] args) {
		
		DishDto dish=new DishDto();
		dish.setName("Chicken Biriyani");
		dish.setPrice(250);
		dish.setQuantity(2);
		dish.setType("Non-veg");
		
		
		System.out.println(dish.getName().concat(" ").concat(dish.getType()).concat(" ").concat(String.valueOf(dish.getPrice())).concat(" ")
				.concat(String.valueOf(dish.getQuantity())));
		
		DishDto dish1=new DishDto("Fish Fry", 250, 5, "Non-veg");
		
		System.out.println(dish1.getName().concat(" ").concat(dish1.getType()).concat(" ").concat(String.valueOf(dish1.getPrice())).concat(" ")
				.concat(String.valueOf(dish1.getQuantity())));
		
		
		
	}

}
