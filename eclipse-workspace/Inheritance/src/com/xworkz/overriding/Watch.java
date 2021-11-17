package com.xworkz.overriding;

public class Watch {

	public String brand;
	public Type type;
	public int price;

	public Watch() {
		System.out.println("Invoked watch with no arguments");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public boolean equals(Object arg) {
		System.out.println("invoked object from watch");
		if (arg != null) {
			System.out.println("ref is not null");
			if (arg instanceof Watch) {
				System.out.println("ref is a instance of watch");
				Watch casted = (Watch) arg;
				String castedBrand = casted.getBrand();
				Type castedTYpe = casted.getType();

				if (this.brand.equals(castedBrand) && this.type.equals(castedTYpe)) {
					System.out.println("Watch brand and type are matching");
					return true;
				} else {
					System.out.println("Watch brand and type are not matching");
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
