package com.xworkz.overriding;

public class Food {

	public String name;
	public int price;
	public int quantity;
	public boolean quality;

	public Food() {
		System.out.println("invoked no-arg constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	@Override
	public boolean equals(Object arg) {
		System.out.println("invoked object from Food");
		if (arg != null) {
			System.out.println("ref is not null");
			if (arg instanceof Food) {
				System.out.println("ref is a instance of Food");
				Food casted = (Food) arg;
				String castedName = casted.getName();
				int castedQuantity = casted.getQuantity();

				if (this.name.equals(castedName) && this.quantity == castedQuantity) {
					System.out.println("Food brand and type are matching");
					return true;
				} else {
					System.out.println("Food brand and type are not matching");
					return false;
				}

			} else {
				System.err.println("cann't compare, Ref is not a instance of Food");
			}
		} else {
			System.err.println("ref cannot be null, pass a proper ref..");
		}
		return false;
	}

}
