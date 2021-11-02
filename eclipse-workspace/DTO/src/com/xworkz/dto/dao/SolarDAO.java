package com.xworkz.dto.dao;
import com.xworkz.dto.SolarDto;


public class SolarDAO {
	
	private SolarDto[] solarContainer=new SolarDto[10];
	private int count=0;
	
	public SolarDAO()
	{
		System.out.println("invoked SolarDAO with no-arg");
	}
	
    public void add(SolarDto solar )
    {
   	 if(this.count<this.solarContainer.length && solar!=null)
   	 {
   		 this.solarContainer[count]=solar;
   		 System.out.println("Index: ".concat(String.valueOf(count)).concat(" ").concat("NAME: ").concat(solar.getBrand()));
   	     count++; }


   	 else
   	 {
   		 System.out.println("Container is full or Passed null");
   	 }
    }
    
    public void delete(int value)
    {
   	this.solarContainer[value]=null; 
   	System.out.println("Deleted at index: ".concat(String.valueOf(value)));


    }

}
