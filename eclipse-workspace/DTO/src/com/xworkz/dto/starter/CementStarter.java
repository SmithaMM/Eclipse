package com.xworkz.dto.starter;
import com.xworkz.dto.CementDto;

public class CementStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CementDto cement=new CementDto();
		
		cement.setName("UltraTech");
		cement.setPrice(340);
		cement.setType("HDPE");
		cement.setQuantity(100);
		cement.setLocation("Bangalore");
		
		CementDto cement1=new CementDto("ACC", 400, 50, "HDPE", "Shimoga");
		
		System.out.println(cement.getName().concat(" ").concat(cement.getType()).concat(" ").concat(cement.getLocation())
				.concat(" ").concat(String.valueOf(cement.getPrice())).concat(" ").concat(String.valueOf(cement.getQuantity())));
		
		System.out.println(cement1.getName().concat(" ").concat(cement1.getType()).concat(" ").concat(cement1.getLocation())
				.concat(" ").concat(String.valueOf(cement1.getPrice())).concat(" ").concat(String.valueOf(cement1.getQuantity())));
		

	}

}
