package com.xworkz.dto.starter;

import com.xworkz.dto.CoffeeDto;
import com.xworkz.dto.dao.CoffeeDAO;

public class CoffeeDaoStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			CoffeeDAO ref=new CoffeeDAO();
			CoffeeDto ref1=new CoffeeDto("Bru", "Filter", 50, 4, "Green Label");
			CoffeeDto ref2=new CoffeeDto("Bru", "Filter", 50, 4, "Green Label");
			
			ref.add(ref1);
			ref.add(ref2);
			
			ref.delete(0);

	}

}
