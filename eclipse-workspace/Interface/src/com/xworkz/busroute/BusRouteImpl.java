package com.xworkz.busroute;

import com.xworkz.dto.BusRouteDto;

public class BusRouteImpl implements BusRouteDao {
	BusRouteDto busRouteDto[] = new BusRouteDto[10];
	private int index = 0;

	@Override
	public void save(BusRouteDto dto) {
		if (dto != null && this.index < this.busRouteDto.length) {
			this.busRouteDto[index] = dto;
			System.out.println("busRouteDto added at index" + index);
			System.out.println("id: " + dto.getID());
			System.out.println("Start point: " + dto.getSTART_POINT());
			System.out.println("Destination: " + dto.getDESTINATIN());
			System.out.println("Driver Name: " + dto.getDRIVER_NAME());

			this.index++;
		} else {
			System.out.println("busRouteDTO is full or passed null");
		}

	}

	@Override
	public void findByDestination(String name) {
		if (name != null) {
			for (int i = 0; i < this.busRouteDto.length; i++) {
				BusRouteDto dest = this.busRouteDto[i];

				if (dest != null) {
					String destination = dest.getDESTINATIN();

					if (name.equals(destination)) {
						System.out.println("Destination matched at index " + dest);
					} else {
						System.out.println("Destination not matched");
					}
				}
			}
		} else {
			System.out.println("Name cannot be null");
		}
	}

	@Override
	public void displayDetails() {
		for (int i = 0; i < this.busRouteDto.length; i++) {
			BusRouteDto details = busRouteDto[i];

			if (details != null) {

				System.out.println("ID: " + details.getID());
				System.out.println("Start Point: " + details.getSTART_POINT());
				System.out.println("Destination: " + details.getDESTINATIN());
				System.out.println("Driver name:  " + details.getDRIVER_NAME());
			}
		}

	}

}
