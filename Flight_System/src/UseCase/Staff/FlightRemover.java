package UseCase.Staff;

import Domain.Entitites.Airline;
import Domain.Entitites.Flight;

public class FlightRemover {

	private Airline airline;

	public FlightRemover(Airline airline) {
		this.airline = airline;
	}

	public void removeFlight(String flightNumber) {
		// Find the flight in the airline's operated flights list
		for (Flight flight : airline.getOperatedFlights()) {
			if (flight.getFlightNumber().equals(flightNumber)) {
				// Remove the flight from the list
				airline.getOperatedFlights().remove(flight);
				System.out.println("Flight removed successfully: " + flightNumber);
				return;
			}
		}
		System.out.println("Flight not found: " + flightNumber);
	}

}
