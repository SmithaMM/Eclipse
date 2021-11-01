package com.xworkz.dto.starter;
import com.xworkz.dto.SolarDto;

public class SolarStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SolarDto solar=new SolarDto();
		
		solar.setBrand("SunPOwer");
		solar.setPrice(2500);
		solar.setCellType("monocrystalline");
		solar.setNoOfPanels(2);
		solar.setPowerTolerence(22);
		
		System.out.println(solar.getBrand().concat(" ").concat(solar.getCellType()).concat(" ").concat(String.valueOf(solar.getNoOfPanels())).concat(" ")
				.concat(String.valueOf(solar.getPowerTolerence())).concat(" ").concat(String.valueOf(solar.getPrice())));
		
		
		SolarDto solar1=new SolarDto("LG", 4000, 2, "polycrystalline", 25);
		
		System.out.println(solar1.getBrand().concat(" ").concat(solar1.getCellType()).concat(" ").concat(String.valueOf(solar1.getNoOfPanels())).concat(" ")
				.concat(String.valueOf(solar1.getPowerTolerence())).concat(" ").concat(String.valueOf(solar1.getPrice())));

	}

}
