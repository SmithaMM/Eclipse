package com.xworkz.overriding;

public class Shoe {
	public String brand;
	public int size;
	public String color;
	public String gender;

	public Shoe() {
		System.out.println("Invoked Shoe with no arguments");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public boolean equals(Object arg) {
		System.out.println("invoked object from Shoe");
		if (arg != null) {
			System.out.println("ref is not null");
			if (arg instanceof Shoe) {
				System.out.println("ref is a instance of Shoe");
				Shoe casted = (Shoe) arg;
				String castedBrand = casted.getBrand();
				String castedTYpe = casted.getGender();

				if (this.brand.equals(castedBrand) && this.gender.equals(castedTYpe)) {
					System.out.println("Shoe brand and type are matching");
					return true;
				} else {
					System.out.println("Shoe brand and gender are not matching");
					return false;
				}

			} else {
				System.err.println("cann't compare, Ref is not a instance of Shoe");
			}
		} else {
			System.err.println("ref cannot be null, pass a proper ref..");
		}
		return false;
	}

}
