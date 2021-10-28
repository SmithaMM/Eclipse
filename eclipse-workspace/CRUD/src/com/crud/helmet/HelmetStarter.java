package com.crud.helmet;
import com.crud.helmet.operator.HelmetOperator;

public class HelmetStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelmetOperator helmet=new HelmetOperator();
		
		helmet.add(null);
		helmet.add("Bell Helmets");
		helmet.add("Shoei Helmets");
		helmet.add("HJC Helmets");
		helmet.add("LS2 Helmets");
		helmet.add("AGV Helmets");

		helmet.display();
		
	}

}
