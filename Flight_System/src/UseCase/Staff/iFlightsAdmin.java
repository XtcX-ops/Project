package UseCase.Staff;

import java.util.Date;

import Domain.Entitites.Flight;

public interface iFlightsAdmin {
	public void addFlight(String departureAirport, String arrivalAirport, Date departureDate,
			Date arrivalDate, int capacity, double price); // Method to add a flight

	public void updateFlight(String flightID, String departureAirport, String arrivalAirport, Date departureDate,
			Date arrivalDate, int capacity, double price); // Method to update flight details

	public void deleteFlight(String flightID); // Method to delete a flight

	public Flight viewFlightDetails(String flightID); // Method to view flight details

	public Flight[] viewAllFlights(); // Method to view all flights

	public Flight[] viewAvailableFlights(String departureAirport, String arrivalAirport); // Method to view available
																							// flights based on
																							// departure
																							// and arrival airports

}
