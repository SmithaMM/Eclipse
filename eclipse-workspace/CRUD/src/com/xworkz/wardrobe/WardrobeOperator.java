package com.xworkz.wardrobe;

public class WardrobeOperator {
	private String[] things=new String[5];
	private int count=0;
	
	public WardrobeOperator()
	{
		System.out.println("invoked no argument constructor");	
	}
	
	public boolean add(String name)
	{
		if(name!=null && this.count<this.things.length)
		{
			this.things[count]=name;
			count++;
			System.out.println("added".concat(name));
			return true;
		}
		else 
		{
			System.err.println("name cannot be null or wardrobe is full");
		}
		return false;
	}

	
	public boolean update(int index, String NewThing)
	{
		if(index>=0 && index<this.things.length && NewThing!=null)
		{
			this.things[index]=NewThing;
			System.out.println("updated thing is ".concat(NewThing));
			return true;
		}
		else
		{
			System.err.println("the index should be greater than or equal to zero and less than " +this.things.length);
			System.err.println("and NewThing cannot be null");
		}
		return false;
	}
	
	
	public boolean delete(int no)
	{
		if(no>=0 && no<this.things.length)
		{
			String ref=things[no];
			this.things[no]=null;
			System.out.println("deleted ".concat(ref));
			return true;
		}
		else
		{
			System.out.println("the index should be greater than or equal to zero and less than " +this.things.length);
		}
			return false;	
	}
	
	
	public boolean match(String thing)
	{
		for(int index=0;index<this.things.length;index++)
		{
			if(this.things[index]!=null)
			{
				if(this.things[index].equals(thing))
				{
					System.out.println("match found ".concat(thing));
					return true;
				}	
				else
				{
					System.out.println("match not found");		
				}
			}
		}
		return false;
	}

	
	
	public boolean firstLetter(String character)
	{
		for(int value=0; value<this.things.length; value++)
		{
			if(things[value]!=null)
			{
				boolean status=things[value].startsWith(character);
				if(status)
				{
					System.out.println("found thing whoes name starts with ".concat(character) .concat(things[value]));
					return true;
				}
				
			}
		}
		System.out.println("not found the thing starts with ".concat(character));
		return false;
	}
	
	
	public boolean lastLetter(String character)
	{
		for(int value=0; value<this.things.length; value++)
		{
			if(things[value]!=null)
			{
				boolean status=things[value].endsWith(character);
				if(status)
				{
					System.out.println("found thing whoes name ends with ".concat(character)   .concat(things[value]));
					return true;
				}
				
			}
		}
		System.out.println("not found the thing ends with ".concat(character));
		return false;
	}
	
	
	public void displayDetails()
	{
		System.out.println("invoked display details");
		for(int index=0; index<this.things.length; index++)
		{
			System.out.println(this.things[index]);
		}
	}
	
}
