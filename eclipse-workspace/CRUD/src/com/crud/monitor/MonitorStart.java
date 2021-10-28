package com.crud.monitor;
import com.crud.monitor.operator.MonitorBrand;

public class MonitorStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MonitorBrand monitor=new MonitorBrand();
		
		monitor.add(null);
		monitor.add("DELL");
		monitor.add("HP");
		monitor.add("LENOVO");
		monitor.add("SAMSUNG");
		monitor.add("Acer");
		monitor.add("LG");
		
		monitor.display();
	}

}
