package UseCase.Staff;

import java.util.Date;

import Domain.Entitites.Airline;
import Domain.Entitites.Flight;

public class FlightManager implements iFlightsAdmin {
	private Airline airline;
	private FlightAdder flightAdder;
	private FlightUpdater flightUpdater;
	private FlightRemover flightRemover;
	private StaffFlightViewer flightViewer;

	public FlightManager(Airline airline) {
		this.airline = airline;
		this.flightAdder = new FlightAdder(airline);
		this.flightUpdater = new FlightUpdater(airline);
		this.flightRemover = new FlightRemover(airline);
		this.flightViewer = new StaffFlightViewer(airline);
	}

	@Override
	public void addFlight(String departureAirport, String arrivalAirport, Date departureDate,
			Date arrivalDate, int capacity, double price) {
		flightAdder.addFlight(departureAirport, arrivalAirport, departureDate, arrivalDate, capacity);
	}

	@Override
	public void updateFlight(String flightID, String departureAirport, String arrivalAirport, Date departureDate,
			Date arrivalDate, int capacity, double price) {
		flightUpdater.updateFlight(flightID, departureAirport, arrivalAirport, departureDate,
				arrivalDate);
	}

	@Override
	public void deleteFlight(String flightID) {
		flightRemover.removeFlight(flightID);
	}

	@Override
	public Flight viewFlightDetails(String flightID) {
		return flightViewer.viewFlightDetails(flightID);
	}

	@Override
	public Flight[] viewAllFlights() {
		return flightViewer.viewAllFlights();
	}

	@Override
	public Flight[] viewAvailableFlights(String departureAirport, String arrivalAirport) {
		return flightViewer.viewAvailableFlights(departureAirport, arrivalAirport);
	}

}
