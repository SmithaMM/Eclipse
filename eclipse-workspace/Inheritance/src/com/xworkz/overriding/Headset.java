package com.xworkz.overriding;

public class Headset {

	public String brand;
	public TypeHeadset type;
	public int battery;
	public String warranty;

	public Headset() {
		System.out.println("invoked Headset no-arg constructor");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public TypeHeadset getType() {
		return type;
	}

	public void setType(TypeHeadset type) {
		this.type = type;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	@Override
	public boolean equals(Object arg) {
		System.out.println("invoked object from Headset");
		if (arg != null) {
			System.out.println("ref is not null");
			if (arg instanceof Headset) {
				System.out.println("ref is a instance of Headset");
				Headset casted = (Headset) arg;
				String castedBrand = casted.getBrand();
				TypeHeadset castedType = casted.getType();

				if (this.brand.equals(castedBrand) && this.type.equals(castedType)) {
					System.out.println("Headset brand and type are matching");
					return true;
				} else {
					System.out.println("Headset brand and type are not matching");
					return false;
				}

			} else {
				System.err.println("cann't compare, Ref is not a instance of Headset");
			}
		} else {
			System.err.println("ref cannot be null, pass a proper ref..");
		}
		return false;
	}

}
