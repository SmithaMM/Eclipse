package com.xworkz.overriding;

public class Fish {
	public String name;
	public TypeFish type;
	public int price;
	public String color;

	public Fish() {
		System.out.println("invoked no-arg constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TypeFish getType() {
		return type;
	}

	public void setType(TypeFish type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public boolean equals(Object arg) {
		System.out.println("invoked object from Fish");
		if (arg != null) {
			System.out.println("ref is not null");
			if (arg instanceof Fish) {
				System.out.println("ref is a instance of Fish");
				Fish casted = (Fish) arg;
				String castedName = casted.getName();
				int castedPrice = casted.getPrice();

				if (this.name.equals(castedName) && this.price == castedPrice) {
					System.out.println("Belt brand and type are matching");
					return true;
				} else {
					System.out.println("Belt brand and type are not matching");
					return false;
				}

			} else {
				System.err.println("cann't compare, Ref is not a instance of Belt");
			}
		} else {
			System.err.println("ref cannot be null, pass a proper ref..");
		}
		return false;
	}

}
