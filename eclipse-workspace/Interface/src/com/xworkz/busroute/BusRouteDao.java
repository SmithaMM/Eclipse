package com.xworkz.busroute;

import com.xworkz.dto.BusRouteDto;

public interface BusRouteDao {
	
	void save(BusRouteDto dto);

	void findByDestination(String name);

	void displayDetails();
		

}
