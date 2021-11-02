package com.xworkz.dto.dao;

import com.xworkz.dto.CementDto;

public class CementDAO {
	
	private CementDto[] cementContainer=new CementDto[10];
	private int count=0;
	
	
	public CementDAO()
	{
		System.out.println("invoked CementDAO with no-arg");
	}
	
    public void add(CementDto cement)
    {
   	 if(this.count<this.cementContainer.length && cement!=null)
   	 {
   		 this.cementContainer[count]=cement;
   		 System.out.println("Index: ".concat(String.valueOf(count)).concat(" ").concat("NAME: ").concat(cement.getName()));
   	     count++; }


   	 else
   	 {
   		 System.out.println("Container is full or Passed null");
   	 }
    }
    
    public void delete(int value)
    {
   	this.cementContainer[value]=null; 
   	System.out.println("Deleted at index: ".concat(String.valueOf(value)));


    }


}
