package com.xworkz.dto.starter;
import com.xworkz.dto.dao.SolarDAO;
import com.xworkz.dto.SolarDto;


public class SolarDaoStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SolarDAO ref=new SolarDAO();
		SolarDto ref1=new SolarDto("LG", 4000, 2, "polycrystalline", 25);
		SolarDto ref2=new SolarDto("SunPower", 5000, 2, "polycrystalline", 25);
		
		ref.add(ref1);
		ref.add(ref2);
		
		ref.delete(1);
	}
}
