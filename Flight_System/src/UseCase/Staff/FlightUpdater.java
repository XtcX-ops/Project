package UseCase.Staff;

import java.util.Date;

import Domain.Entitites.Airline;
import Domain.Entitites.Flight;

public class FlightUpdater {
	private Airline airline;

	public FlightUpdater(Airline airline) {
		this.airline = airline;
	}

	public void updateFlight(String flightNumber, String departureCity, String arrivalCity, Date departureDate,
			Date arrivalDate) {
		// Find the flight in the airline's operated flights list
		for (Flight flight : airline.getOperatedFlights()) {
			if (flight.getFlightNumber().equals(flightNumber)) {
				FlightRemover flightRemover = new FlightRemover(airline);
				flightRemover.removeFlight(flightNumber);

				// Create a new flight object with updated details

				FlightAdder flightAdder = new FlightAdder(airline);
				flightAdder.addFlight(departureCity, arrivalCity, departureDate, arrivalDate,
						flight.getSeats().length);
			}
		}
		System.out.println("Flight not found: " + flightNumber);
	}
}
