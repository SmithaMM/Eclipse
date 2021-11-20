package com.xworkz.hospital.starter;

import com.xworkz.hostel.Hostel;
import com.xworkz.hostel.HostelRule;

public class HostelStarter {

	public static void main(String[] args) {
		
		Hostel hostel = new HostelRule();
		
		System.out.println("ADMISSION: "+hostel.admission());
		System.out.println("CLOSING TIME: "+hostel.closeTime());
		System.out.println("GENDER: "+hostel.gender());
				
	}

}
