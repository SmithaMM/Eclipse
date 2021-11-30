package com.xworkz.electioncomission;

import com.xworkz.electioncomission.exception.CashLessException;

public class MedicalInsurance {

	public void canAvailCashless(String name, double totalHours) throws CashLessException {
		if (name != null && name.length() > 2 && name.length() <= 26 && totalHours >= 24) {
			System.out.println("Can avail medical insurance");
		}

		else {
			System.err.println("Cannot avail medical insurance");

			throw new CashLessException();

		}
	}
}
