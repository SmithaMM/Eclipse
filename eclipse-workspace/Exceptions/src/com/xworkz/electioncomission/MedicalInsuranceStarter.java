package com.xworkz.electioncomission;

import com.xworkz.electioncomission.exception.CashLessException;

public class MedicalInsuranceStarter {

	public static void main(String[] args) throws CashLessException {

		MedicalInsurance insurance = new MedicalInsurance();
		insurance.canAvailCashless("S", 15);
		System.out.println("No Erorrs");

	}

}
