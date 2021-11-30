package com.xworkz.electioncomission;

import com.xworkz.electioncomission.exception.NotEligibleForVoteException;

public class ElectionComissionStarter {

	public static void main(String[] args) throws NotEligibleForVoteException {

		ElectionComission election = new ElectionComission();

		election.canVote("SM", 27);

		System.out.println("no error");

	}

}
