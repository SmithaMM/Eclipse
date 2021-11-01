package com.xworkz.dto.starter;
import com.xworkz.dto.StatueDto;

public class StatueStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StatueDto statue=new StatueDto();
		
		statue.setName("Statue of Unity");
		statue.setLocation("Gujarat");
		statue.setMaterialUsed("Bronze");
		statue.setHeight(597.0f);
		statue.setWidth(0.0f);
		
		System.out.println(statue.getName().concat(" ").concat(statue.getLocation()).concat(" ").concat(statue.getMaterialUsed()).concat(" ")
				.concat(String.valueOf(statue.getHeight())));
		
		
		StatueDto statue1=new StatueDto("Thiruvalluvar Statue", 133.f, 0.0f, "Kanyakumari", "Rock");
		
		System.out.println(statue1.getName().concat(" ").concat(statue1.getLocation()).concat(" ").concat(statue1.getMaterialUsed()).concat(" ")
				.concat(String.valueOf(statue1.getHeight())));
		

	}

}
