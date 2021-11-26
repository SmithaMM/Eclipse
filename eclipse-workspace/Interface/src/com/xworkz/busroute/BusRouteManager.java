package com.xworkz.busroute;

import com.xworkz.dto.BusRouteDto;

public class BusRouteManager {

	private BusRouteDao dao;

	public BusRouteManager(BusRouteDao dao) 
	{
		if (dao != null) {
			this.dao = dao;
		} else {
			System.out.println("dao cannot be null");
		}
	}

	public void saveRoute(BusRouteDto dto) {
		if (dto != null) {
			dao.save(dto);
		} else {
			System.out.println("dto cannot be null");
		}
	}

	public void findRoute(String dest) {
		if (dest != null) {
			dao.findByDestination(dest);
		}

		else {
			System.out.println("destination cannot be null");
		}
	}

	public void displayRoute() {

		dao.displayDetails();

	}

}
