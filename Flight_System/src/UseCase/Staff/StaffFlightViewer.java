package UseCase.Staff;

import Domain.Entitites.Airline;
import Domain.Entitites.Flight;

public class StaffFlightViewer {
	private Airline airline; // Assuming Airline is a class that contains flight information

	public StaffFlightViewer(Airline airline) {
		this.airline = airline;
	}

	// This class is responsible for viewing flight details and available flights
	// for staff members.

	public Flight viewFlightDetails(String flightID) {
		for (Flight flight : airline.getOperatedFlights()) {
			if (flight.getFlightNumber().equals(flightID)) {
				return flight; // Return the flight object if found
			}
		}
		return null; // Return null if flight not found
	}

	public Flight[] viewAllFlights() {
		Flight[] allFlights = new Flight[airline.getOperatedFlights().size()];
		for (int i = 0; i < airline.getOperatedFlights().size(); i++) {
			allFlights[i] = airline.getOperatedFlights().get(i);
		}
		return allFlights; // Return the array of all flights
	}

	public Flight[] viewAvailableFlights(String departureAirport, String arrivalAirport) {
		return airline.getOperatedFlights().stream()
				.filter(flight -> flight.getDepartureCity().equals(departureAirport)
						&& flight.getArrivalCity().equals(arrivalAirport))
				.toArray(Flight[]::new); // Return an array of available flights
	}
}
