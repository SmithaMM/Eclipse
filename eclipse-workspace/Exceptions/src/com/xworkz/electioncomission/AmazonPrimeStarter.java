package com.xworkz.electioncomission;

import com.xworkz.electioncomission.exception.NotaPrimeMember;

public class AmazonPrimeStarter {

	public static void main(String[] args) throws NotaPrimeMember {

		AmazonPrime prime = new AmazonPrime();
		prime.freeDelivery(true, "INDIA");

		System.out.println("No error");

	}

}
