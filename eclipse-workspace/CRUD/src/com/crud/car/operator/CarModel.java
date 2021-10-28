package com.crud.car.operator;

public class CarModel {
	private String[] name=new String[5];
	private int count=5;
	
	public CarModel()
	{
		System.out.println("invoked no argument constructor");
	}
	
	public void add(String model)
	{
		if(model!=null && this.count<this.name.length)
		{
			name[count]=model;
			count++;
			System.out.println("added".concat(model));
		}
		else
		{
			System.out.println("brand name cannot null or the list is full");
		}
	}
	
	public void display()
	{
	  System.out.println("invoked display");
	  for(int mod=0; mod<this.name.length; mod++)
	  {
		  String ref=name[mod];
		  System.out.println(ref);
	  }

	}

}
