package com.xworkz.overriding.starter;

import com.xworkz.overriding.Type;
import com.xworkz.overriding.Watch;

public class WatchStarter {

	public static void main(String[] args) {
		
		Watch watch = new Watch();
		watch.setBrand("TITAN");
		watch.setPrice(5000);
		watch.setType(Type.ANALOG);
		
		Watch watch1 = new Watch();
		watch1.setBrand("TITAN");
		watch1.setPrice(4500);
		watch1.setType(Type.ANALOG);
		
		watch.equals(watch1);
			
	}

}
