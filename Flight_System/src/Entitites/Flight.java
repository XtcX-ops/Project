package Entitites;

import java.util.Date;

public class Flight {
	private String flightNumber;
	private String departureCity;
	private String arrivalCity;
	private Date departureDate;
	private Date arrivalDate;
	private Seat[] seats;

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

	public String getFlightNumber() {
		return flightNumber;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public Seat[] getSeats() {
		return seats;
	}

	public int getAvailableSeatCount() {
		int count = 0;
		for (Seat seat : seats) {
			if (seat != null && seat.getStatus().equals("Available")) {
				count++;
			}
		}
		return count;
	}

}
