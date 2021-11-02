package com.xworkz.dto.starter;
import com.xworkz.dto.dao.FoodDAO;
import com.xworkz.dto.FoodDto;
import com.xworkz.dto.Type;

public class FoodDaoStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 FoodDAO foodDao=new FoodDAO();
 FoodDto ref1=new FoodDto(1,"CHICKEN BIRIYANI", Type.NONVEG, 250.0, 10);
 FoodDto ref2=new FoodDto(2,"FISH FRY", Type.NONVEG, 200.0, 5);
 FoodDto ref3=new FoodDto(3,"MASALA DOSA", Type.VEG, 50.0, 15);
 
 foodDao.save(ref1);
 foodDao.save(ref2);
 foodDao.save(ref3);
 foodDao.displayDetails();
 
 
 foodDao.updatePriceByName("IDLI", 50.0);
 foodDao.updateQuantityByName("CHICKEN BIRIYANI", 20);
 foodDao.displayDetails();
 
 foodDao.findByName(null);
 foodDao.findByName("CHITHRANNA");
 foodDao.findByNameAndPrice("FISH FRY", 100);
 foodDao.findByNameAndPrice("FISH FRY", 200.0);
 foodDao.findByNameAndType("MASALA DOSA", Type.VEG);
 foodDao.displayDetails();
 foodDao.totalFoodItems();
 
 
 
 
	}

}
