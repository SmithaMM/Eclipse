package com.xworkz.election.starter;

import com.xworkz.election.ElectionComission;
import com.xworkz.election.ElectionRules;
import com.xworkz.election.ElectrionRulesSmitha;

public class ElectionStarter {

	public static void main(String[] args) {
		
		ElectionRules electionRules = new ElectrionRulesSmitha();
		ElectionComission comission = new ElectionComission(electionRules);
		comission.provideVoterId();			
	}

}
