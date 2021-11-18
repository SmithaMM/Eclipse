package com.xworkz.overriding;

public class Sock {

	public String size;
	public int price;
	public Material material;
	public TypeSock type;

	public Sock() {
		System.out.println("invoked no arg constructor");
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public TypeSock getType() {
		return type;
	}

	public void setType(TypeSock type) {
		this.type = type;
	}

	@Override
	public boolean equals(Object arg) {
		System.out.println("invoked object from Sock");
		if (arg != null) {
			System.out.println("ref is not null");
			if (arg instanceof Sock) {
				System.out.println("ref is a instance of Sock");
				Sock casted = (Sock) arg;
				TypeSock castedType = casted.getType();
				int castedPrice = casted.getPrice();

				if (this.type.equals(castedType) && this.price == castedPrice) {
					System.out.println("Sock brand and type are matching");
					return true;
				} else {
					System.out.println("Sock brand and type are not matching");
					return false;
				}

			} else {
				System.err.println("cann't compare, Ref is not a instance of watch");
			}
		} else {
			System.err.println("ref cannot be null, pass a proper ref..");
		}
		return false;
	}

}
