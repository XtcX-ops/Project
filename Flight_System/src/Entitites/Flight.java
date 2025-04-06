package Entitites;

import java.util.Date;

public class Flight {
	public String flightNumber;
	public String departureCity;
	public String arrivalCity;
	public Date departureDate;
	public Date arrivalDate;
	public Seat[] seats;

	// Constructor
	public Flight(String flightNumber, String departureCity, String arrivalCity, Date departureDate, Date arrivalDate,
			int totalSeats) {
		this.flightNumber = flightNumber;
		this.departureCity = departureCity;
		this.arrivalCity = arrivalCity;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.seats = new Seat[totalSeats];
	}

}
