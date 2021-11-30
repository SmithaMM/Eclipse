package com.xworkz.electioncomission;

import com.xworkz.electioncomission.exception.NotaPrimeMember;

public class AmazonPrime {

	public void freeDelivery(boolean primeMember, String country) throws NotaPrimeMember {
		if (primeMember && country == "INDIA") {
			System.out.println("Eligible for free delivery");
		}

		else {
			System.err.println("Not Eligible for free delivery ");
			throw new NotaPrimeMember();
		}
	}

}
