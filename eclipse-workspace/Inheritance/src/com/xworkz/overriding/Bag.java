package com.xworkz.overriding;

public class Bag {

	public int price;
	public Color color;
	public String section;

	public Bag() {
		super();
		System.out.println("invoked no-arg constructor");
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	@Override
	public boolean equals(Object arg) {
		System.out.println("invoked object from Bag");
		if (arg != null) {
			System.out.println("ref is not null");
			if (arg instanceof Bag) {
				System.out.println("ref is a instance of Bag");
				Bag casted = (Bag) arg;
				int castedPrice = casted.getPrice();
				Color castedColor = casted.getColor();

				if (this.price == castedPrice && this.color.equals(castedColor)) {
					System.out.println("Bag Price and Color are matching");
					return true;
				} else {
					System.out.println("Bag Price and Color are not matching");
					return false;
				}

			} else {
				System.err.println("cann't compare, Ref is not a instance of Bag");
			}
		} else {
			System.err.println("ref cannot be null, pass a proper ref..");
		}
		return false;
	}

}
