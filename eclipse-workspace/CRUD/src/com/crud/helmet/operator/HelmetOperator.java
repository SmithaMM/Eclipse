package com.crud.helmet.operator;

public class HelmetOperator {
	private String[] brand=new String[5];
	private int count;
	
	public HelmetOperator()
	{
		System.out.println("invoked no argument constructor");
	}
	
	public void add(String name)
	{
		if(name!=null && this.count<this.brand.length) 
		{
			brand[count]=name;
			count++;
			System.out.println("added".concat(name));
		}
		else
		{
			System.err.println("name cannot be null or the list is full");
		}
	}
	
	public void display()
	{
	System.out.println("invoked display");
	for(int name=0;name<this.brand.length;name++)
	{
		System.out.println(this.brand[name]);
	}
	}
	

}
