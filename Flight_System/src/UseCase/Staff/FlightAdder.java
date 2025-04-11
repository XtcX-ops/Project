package UseCase.Staff;

import java.util.Date;

import Domain.Entitites.Airline;
import Domain.Entitites.Flight;

public class FlightAdder {
	private Airline airline;

	public FlightAdder(Airline airline) {
		this.airline = airline;
	}

	public void addFlight(String departureAirportCode, String arrivalAirportCode,
			Date departureDateDate, Date arrivalDateDate, int totalSeats) {
		// Create a new flight object
		// Generate a flight number based on the airline code and current date
		String flightNumber = airline.getAirlineCode() + "-" + System.currentTimeMillis();

		Flight newFlight = new Flight(flightNumber, departureAirportCode, arrivalAirportCode, departureDateDate,
				arrivalDateDate,
				totalSeats);
		// Add the flight to the airline's operated flights list
		airline.getOperatedFlights().add(newFlight);
		System.out.println("Flight added successfully: " + flightNumber);
	}

}
