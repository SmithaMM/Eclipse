package com.xworkz.dto.dao;
import com.xworkz.dto.DishDto;

public class DishDAO {

	private DishDto[] dishContainer=new DishDto[2];
	private int count=0;
	
	public DishDAO()
	{
		System.out.println("invoked SolarDAO with no-arg");
	}
	
    public void add(DishDto dish )
    {
   	 if(this.count<this.dishContainer.length && dish!=null)
   	 {
   		 this.dishContainer[count]=dish;
   		 System.out.println("Index: ".concat(String.valueOf(count)).concat(" ").concat("NAME: ").concat(dish.getName()));
   	     count++; }


   	 else
   	 {
   		 System.out.println("Container is full or Passed null");
   	 }
    }
    
    public void delete(int value)
    {
   	this.dishContainer[value]=null; 
   	System.out.println("Deleted at index: ".concat(String.valueOf(value)));


    }
    
    
}
