package com.xworkz.dto.starter;
import com.xworkz.dto.CoffeeDto;

public class CoffeeStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CoffeeDto coffee=new CoffeeDto();
		
		coffee.setBrand("Nescafe");
		coffee.setCost(200);
		coffee.setFlavour("Gold Roasted");
		coffee.setQuantity(2);
		coffee.setType("filter");
		
		CoffeeDto coffee1=new CoffeeDto("Bru", "Filter", 50, 4, "Green Label");
		
		System.out.println(coffee.getBrand().concat(" ").concat(coffee.getFlavour()).concat(" ").concat(coffee.getType()).concat(" ")
				.concat(String.valueOf(coffee.getCost())).concat(" ").concat(String.valueOf(coffee.getQuantity())));
		

		System.out.println(coffee1.getBrand().concat(" ").concat(coffee1.getFlavour()).concat(" ").concat(coffee1.getType()).concat(" ")
				.concat(String.valueOf(coffee1.getCost())).concat(" ").concat(String.valueOf(coffee1.getQuantity())));
		
		

	}

}
