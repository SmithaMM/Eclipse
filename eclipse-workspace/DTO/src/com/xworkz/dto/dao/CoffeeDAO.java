package com.xworkz.dto.dao;
import com.xworkz.dto.CoffeeDto;




public class CoffeeDAO {
	private CoffeeDto[] coffeeContainer=new CoffeeDto[2];
	private int count=0;
	
	
	public CoffeeDAO()
	{
		System.out.println("invoked CoffeeDAO with no-arg");
	}
	
    public void add(CoffeeDto coffee )
    {
   	 if(this.count<this.coffeeContainer.length && coffee!=null)
   	 {
   		 this.coffeeContainer[count]=coffee;
   		 System.out.println("Index: ".concat(String.valueOf(count)).concat(" ").concat("NAME: ").concat(coffee.getBrand()));
   	     count++; }


   	 else
   	 {
   		 System.out.println("Container is full or Passed null");
   	 }
    }
    
    public void delete(int value)
    {
   	this.coffeeContainer[value]=null; 
   	System.out.println("Deleted at index: ".concat(String.valueOf(value)));


    }

}
