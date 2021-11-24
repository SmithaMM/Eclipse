package com.xworkz.internet.starter;

import com.xworkz.internet.Browser;
import com.xworkz.internet.Internet;
import com.xworkz.internet.InternetAirtel;
import com.xworkz.internet.InternetTata;

public class InternetStarter {

	public static void main(String[] args) {
		Internet internet = new InternetAirtel();
		Internet internet1 = new InternetTata();

		Browser browse = new Browser(internet);
		Browser browse1 = new Browser(internet1);

		browse.browse();
		browse1.browse();
		
	}

}
