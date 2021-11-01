package com.xworkz.dto.starter;

import com.xworkz.dto.DishDto;
import com.xworkz.dto.dao.DishDAO;

public class DishDaoStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DishDAO ref=new DishDAO();
		DishDto ref1=new DishDto("Fish Fry", 250, 5, "Non-veg");
		DishDto ref2=new DishDto("Fish Fry", 250, 5, "Non-veg");
		
		ref.add(ref1);
		ref.add(ref2);
		
		ref.delete(0);
		

	}

}
