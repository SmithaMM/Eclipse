package com.xworkz.overriding.starter;

import com.xworkz.overriding.NewsPaper;

public class NewsPaperStarter {

	public static void main(String[] args) {

		NewsPaper newsPaper = new NewsPaper();
		newsPaper.setName("The Times of India");
		newsPaper.setLanguage("English");
		newsPaper.setSince(1838);

		NewsPaper newsPaper1 = new NewsPaper();
		newsPaper1.setName("The Hindu");
		newsPaper1.setLanguage("English");
		newsPaper1.setSince(1878);

		newsPaper.equals(newsPaper1);

	}

}
