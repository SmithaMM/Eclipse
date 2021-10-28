package com.crud.monitor.operator;

public class MonitorBrand {
	private String[] brand=new String[5];
	private int count;
	
	public MonitorBrand()
	{
		System.out.println("invoked no argument constructor");
	}
	
	public void add(String monitorBrand)
	{
		if(monitorBrand!=null && this.count<this.brand.length)
		{
			brand[count]=monitorBrand;
			count++;
			System.out.println("added".concat(monitorBrand));
		}
		else
		{
			System.err.println("brand name cannot be null or the list is full");
		}
	}
	
	public void display()
	{
		System.out.println("invoked display");
		for(int brand=0;brand<this.brand.length;brand++) 
		{
			String ref=this.brand[brand];
			System.out.println(ref);
		}
	}	
	

}
