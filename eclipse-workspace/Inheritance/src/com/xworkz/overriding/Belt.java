package com.xworkz.overriding;

public class Belt {
	public int price;
	public String material;
	public int size;
	public String gender;

	public Belt() {
		System.out.println("invoked no-arg constructor");
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public boolean equals(Object arg) {
		System.out.println("invoked object from Belt");
		if (arg != null) {
			System.out.println("ref is not null");
			if (arg instanceof Belt) {
				System.out.println("ref is a instance of Belt");
				Belt casted = (Belt) arg;
				String castedMaterial = casted.getMaterial();
				int castedPrice = casted.getPrice();

				if (this.material.equals(castedMaterial) && this.price == castedPrice) {
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
