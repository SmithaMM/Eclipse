package com.xworkz.dto.starter;
import com.xworkz.dto.BlueToothDto;

public class BlueToothStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlueToothDto blueTooth=new BlueToothDto();
		
		blueTooth.setBrand("BoAt");
		blueTooth.setBluetoothRange("5m");
		blueTooth.setColor("White");
		blueTooth.setPrice(2000);
		blueTooth.setQuantity(5);
		
		System.out.println(blueTooth.getBrand().concat(" ").concat(blueTooth.getColor()).concat(" ").concat(blueTooth.getBluetoothRange())
				.concat(" ").concat(String.valueOf(blueTooth.getPrice())).concat(" ").concat(String.valueOf(blueTooth.getQuantity())));
		
		
		
		BlueToothDto blueTooth1=new BlueToothDto("Samsung", 1500, "Black", "4m", 5);

		System.out.println(blueTooth1.getBrand().concat(" ").concat(blueTooth1.getColor()).concat(" ").concat(blueTooth1.getBluetoothRange())
				.concat(" ").concat(String.valueOf(blueTooth1.getPrice())).concat(" ").concat(String.valueOf(blueTooth1.getQuantity())));
		
	}

}
