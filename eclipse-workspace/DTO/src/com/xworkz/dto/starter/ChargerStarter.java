package com.xworkz.dto.starter;
import com.xworkz.dto.ChargerDto;

public class ChargerStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChargerDto charger=new ChargerDto();

charger.setBrand("Nokia");
charger.setColor("white");
charger.setPrice(1500);
charger.setQuantity(10);
charger.setType("Wall Charger");

System.out.println(charger.getBrand().concat(" ").concat(charger.getColor()).concat(" ").concat(charger.getType()).concat(" ")
		.concat(String.valueOf(charger.getPrice())).concat(" ").concat(String.valueOf(charger.getQuantity())));


ChargerDto charger1=new ChargerDto("Samsung", 1000, "Black" , "Wall Charger", 5);

System.out.println(charger1.getBrand().concat(" ").concat(charger1.getColor()).concat(" ").concat(charger1.getType()).concat(" ")
		.concat(String.valueOf(charger1.getPrice())).concat(" ").concat(String.valueOf(charger1.getQuantity())));
	
				
	}

}
