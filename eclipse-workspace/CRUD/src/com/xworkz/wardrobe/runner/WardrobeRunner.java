package com.xworkz.wardrobe.runner;
import com.xworkz.wardrobe.WardrobeOperator;

public class WardrobeRunner {

	public static void main(String[] args) {
		WardrobeOperator reference=new WardrobeOperator();
		
		if(reference.add("Saree"))
		{
			System.out.println("added successfully");
		}
		else
		{
			System.out.println("add failed");
		}
		
		reference.add("shirt");
		reference.add("pant");
		reference.add("laptop");
		reference.add("bag");
		
		reference.displayDetails();
		
		if(reference.update(2, "watch"))
				{
			System.out.println("updated successfully");
				}
		else
		{
			System.out.println("update failed");
		}
		
		reference.displayDetails();
		
		if(reference.match("Saree"))
		{
			System.out.println("found match");
		}
		else
		{
			System.out.println("match not found");
		}
		
		reference.firstLetter("S");
		reference.lastLetter("e");
			
		
		

	}

}
