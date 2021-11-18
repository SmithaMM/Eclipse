package com.xworkz.overriding;

public class Stadium {
	public String name;
	public String city;
	public int areaInMeters;

	public Stadium() {
		System.out.println("invoked no-arg constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAreaInMeters() {
		return areaInMeters;
	}

	public void setAreaInMeters(int areaInMeters) {
		this.areaInMeters = areaInMeters;
	}

	@Override
	public boolean equals(Object arg) {
		System.out.println("invoked object from Stadium");
		if (arg != null) {
			System.out.println("ref is not null");
			if (arg instanceof Stadium) {
				System.out.println("ref is a instance of Stadium");
				Stadium casted = (Stadium) arg;
				String castedName = casted.getName();
				String castedCity = casted.getCity();

				if (this.name.equals(castedName) && this.city.equals(castedCity)) {
					System.out.println("Stadium brand and type are matching");
					return true;
				} else {
					System.out.println("Stadium brand and type are not matching");
					return false;
				}

			} else {
				System.err.println("cann't compare, Ref is not a instance of Stadium");
			}
		} else {
			System.err.println("ref cannot be null, pass a proper ref..");
		}
		return false;
	}

}
