package com.xworkz.hospital.starter;

import com.xworkz.hospital.Hospital;
import com.xworkz.hospital.HospitalRule;

public class HospitalStarter {

	public static void main(String[] args) {

		Hospital hospital = new HospitalRule();

		System.out.println("REGISTRATION STATUS: " + hospital.register());
		System.out.println("ADVANCE STATUS: " + hospital.payAdvance());
		System.out.println("INSURANCE: " + hospital.validInsurance());

	}

}
