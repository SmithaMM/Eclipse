package com.xworkz.electioncomission;

public class TheatreStarter {

	public static void main(String[] args) {

		Theatre theatre = new Theatre("Mugilupete");

		theatre.bookTicketGandhiClass("Mugilupete", TicketType.GANDHI_CLASS, 5);

		theatre.bookTicketMiddleClass("Mugilupete", TicketType.MIDDLE_CLASS, 5);

		theatre.bookTicketBalcony("Mugilupete", TicketType.BALCONY, 2);

		System.out.println("No Error");

	}
}
