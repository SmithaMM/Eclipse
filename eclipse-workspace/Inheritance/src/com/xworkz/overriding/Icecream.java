package com.xworkz.overriding;

public class Icecream {
	public Flavour flavour;
	public String name;

	public Icecream() {
		System.out.println("Invoked watch with no arguments");
	}

	public Flavour getFlavour() {
		return flavour;
	}

	public void setFlavour(Flavour flavour) {
		this.flavour = flavour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object arg) {
		System.out.println("invoked object from Icecream");
		if (arg != null) {
			System.out.println("ref is not null");
			if (arg instanceof Icecream) {
				System.out.println("ref is a instance of Icecream");
				Icecream casted = (Icecream) arg;
				String castedName = casted.getName();
				Flavour castedFlavour = casted.getFlavour();

				if (this.name.equals(castedName) && this.flavour.equals(castedFlavour)) {
					System.out.println("Icecream brand and type are matching");
					return true;
				} else {
					System.out.println("Icecream brand and type are not matching");
					return false;
				}

			} else {
				System.err.println("cann't compare, Ref is not a instance of Icecream");
			}
		} else {
			System.err.println("ref cannot be null, pass a proper ref..");
		}
		return false;
	}

}
