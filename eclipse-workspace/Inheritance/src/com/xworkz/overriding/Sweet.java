package com.xworkz.overriding;

public class Sweet {
	private String name;
	private SweetColor type;
	private float price;
	private SweetShape shape;

	public Sweet()
	{
		System.out.println("Invoked no-arg Sweet Constructor");
	}

	public String toString()
	{
		System.out.println("Invoked toString from Sweet");
		System.out.println("this.name");
		System.out.println("this.type");
		System.out.println("this.price");
		System.out.println("this.shape");
		return "returned Sweet";
	}

	public int hashCode()
	{
		System.out.println("Invoked hashCode from sweet");
		return 17;

	}

	public boolean equals(Object obj)
	{
		System.out.println("Invoked equals method from Sweet");
		if(obj!=null)
		{
			System.out.println("reference is not null");

		if(obj instanceof Sweet)
		{
			System.out.println("Ref is Sweet");
			Sweet casted=(Sweet)obj;
			String castedName=casted.getName();
			SweetColor castedColor=casted.getType();
			if(this.name.equals(castedName) && this.type.equals(castedColor))
			{
				System.out.println("name and colorType are matching");
				return true;
			}
			else
			{
				System.err.println("name or color type is not matching");
			}
		}
		else
		{
			System.err.println(" Ref is not a match");

		}
		}
	else
		{
			System.err.println("Referance cannot be null!!");
		}
		return false;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SweetColor getType() {
		return type;
	}

	public void setType(SweetColor type) {
		this.type = type;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public SweetShape getShape() {
		return shape;
	}

	public void setShape(SweetShape shape) {
		this.shape = shape;
	}

}
