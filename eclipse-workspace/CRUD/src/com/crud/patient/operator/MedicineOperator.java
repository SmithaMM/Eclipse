package com.crud.patient.operator;

public class MedicineOperator {
	private String[] container=new String[5];
	private int count;
	
	public MedicineOperator()
	{
		System.out.println("invoked no argument constructor");
	}
	
	public void add(String medicineName)
	{
		if(medicineName!=null && this.count<this.container.length)
		{
			container[count]=medicineName;
			count++;
			System.out.println("added".concat(medicineName));
		}
		else 
		{
			System.err.println("Medicine name cannot be null or the container is full");
		}
	}
	
	public void display()
	{
		System.out.println("invoked display");
		for(int tablet=0;tablet<this.container.length;tablet++)
		{
			System.out.println(this.container[tablet]);
		}
	}

}
