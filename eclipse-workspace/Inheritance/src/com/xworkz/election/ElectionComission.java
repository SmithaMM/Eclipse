package com.xworkz.election;

public class ElectionComission {
	
	private ElectionRules electionRules;
	public ElectionComission(ElectionRules electionRules)
	{
		this.electionRules=electionRules;
	}
	
	public void provideVoterId()
	{
		System.out.println("invoked provideVoterId");
		if(electionRules!=null)
		{
			int age = electionRules.validAge();
			int ward = electionRules.wardNo();
			String address = electionRules.address();
			if(age>18 && ward>=1 && ward<=300 && address.length()>10 && address.length()<50)
			{
				System.out.println("Provide voter ID");
			}
			else
			{
				System.err.println("Cannot provide voter ID");
			}
		}
	}

}
