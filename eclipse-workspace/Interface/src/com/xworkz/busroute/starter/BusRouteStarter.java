package com.xworkz.busroute.starter;

import com.xworkz.busroute.BusRouteDao;
import com.xworkz.busroute.BusRouteImpl;
import com.xworkz.busroute.BusRouteManager;
import com.xworkz.dto.BusRouteDto;

public class BusRouteStarter {

	public static void main(String[] args) {
		

			BusRouteDao dao=new BusRouteImpl();

			BusRouteDto route1=new BusRouteDto();
			route1.setID(01);
			route1.setSTART_POINT("Shivamogga");
			route1.setDESTINATIN("Mysore");
			route1.setDRIVER_NAME("Kumar");
			
			BusRouteDto route2=new BusRouteDto();
			route2.setID(02);
			route2.setSTART_POINT("Thirthahalli");
			route2.setDESTINATIN("Bangalore");
			route2.setDRIVER_NAME("Ramesh");
			
			dao.save(route1);
			dao.save(route2);

			BusRouteManager bus = new BusRouteManager(dao);
			
			BusRouteDto route3=new BusRouteDto();
			route3.setID(03);
			route3.setSTART_POINT("Mangalore");
			route3.setDESTINATIN("Shivamogga");
			route3.setDRIVER_NAME("Raju");
			

			bus.saveRoute(route3);

			bus.findRoute("Chikkamagaluru");

			bus.displayRoute();


		}
	}


