package com.xworkz.electioncomission;

import com.xworkz.electioncomission.exception.NotEligibleForVoteException;

public class ElectionComission {

	public void canVote(String name, int age) throws NotEligibleForVoteException {
		if (name != null && name.length() > 2 && name.length() <= 26 && age > 18) {
			System.out.println(name + " Eligible to vote");
		} else {
			System.out.println(name + " Not Eligible to vote");
			throw new NotEligibleForVoteException();
		}
	}
}
