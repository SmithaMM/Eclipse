package com.xworkz.election;

public class ElectrionRulesSmitha implements ElectionRules {

	
	public int validAge() {
		System.out.println("invoked validAge");
		return 27;
	}

	
	public int wardNo() {
		System.out.println("invoked wardNo");
		return 17;	
	}


	public String address() {
		System.out.println("invoked Address");
		return "Madabur, PIN: 577134";		
	}
	
	
	
	
	
	

	

}
