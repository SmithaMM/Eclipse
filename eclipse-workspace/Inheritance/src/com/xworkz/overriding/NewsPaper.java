package com.xworkz.overriding;

public class NewsPaper {

	public String name;
	public String language;
	public int since;

	public NewsPaper() {
		System.out.println("invoked no-arg constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getSince() {
		return since;
	}

	public void setSince(int since) {
		this.since = since;
	}

	@Override
	public boolean equals(Object arg) {
		System.out.println("invoked object from NewsPaper");
		if (arg != null) {
			System.out.println("ref is not null");
			if (arg instanceof NewsPaper) {
				System.out.println("ref is a instance of NewsPaper");
				NewsPaper casted = (NewsPaper) arg;
				String castedName = casted.getName();
				int castedSince = casted.getSince();

				if (this.name.equals(castedName) && this.since == castedSince) {
					System.out.println("News paper name and year are matching");
					return true;
				} else {
					System.out.println("News paper name and year are not matching");
					return false;
				}

			} else {
				System.err.println("cann't compare, Ref is not a instance of castedSince");
			}
		} else {
			System.err.println("ref cannot be null, pass a proper ref..");
		}
		return false;
	}

}
