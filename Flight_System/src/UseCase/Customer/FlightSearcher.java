package UseCase.Customer;

import java.util.ArrayList;
import java.util.Date;

import Domain.Entitites.Airline;
import Domain.Entitites.Flight;

public class FlightSearcher {
	private ArrayList<Airline> airlines = new ArrayList<Airline>();

	public FlightSearcher(ArrayList<Airline> airlines) {
		this.airlines = airlines;
	}

	public void searchBooking(String departureLocation, String arrivalLocation) {
		ArrayList<Flight> flights = new ArrayList<Flight>();

		for (Airline airline : airlines) {
			for (Flight flight : airline.getOperatedFlights()) {
				if (flight.getDepartureCity().equalsIgnoreCase(departureLocation)
						&& flight.getArrivalCity().equalsIgnoreCase(arrivalLocation)) {
					flights.add(flight);
				}
			}
		}
		if (flights.isEmpty()) {
			System.out.println("No flights found for the given route.");
		} else {
			System.out.println("Available flights:");
			for (Flight flight : flights) {
				System.out.println("Flight Number: " + flight.getFlightNumber() + ", Departure Date: "
						+ flight.getDepartureDate() + ", Arrival Date: " + flight.getArrivalDate()
						+ ", Available Seats: " + flight.getAvailableSeatCount());
			}
		}
	}

	public void searchBooking(String departureLocation, String arrivalLocation, Date departureDate) {
		ArrayList<Flight> flights = new ArrayList<Flight>();

		for (Airline airline : airlines) {
			for (Flight flight : airline.getOperatedFlights()) {
				if (flight.getDepartureCity().equalsIgnoreCase(departureLocation)
						&& flight.getArrivalCity().equalsIgnoreCase(arrivalLocation)
						&& flight.getDepartureDate().equals(departureDate)) {
					flights.add(flight);
				}
			}
		}
		if (flights.isEmpty()) {
			System.out.println("No flights found for the given route and date.");
		} else {
			System.out.println("Available flights:");
			for (Flight flight : flights) {
				System.out.println("Flight Number: " + flight.getFlightNumber() + ", Departure Date: "
						+ flight.getDepartureDate() + ", Arrival Date: " + flight.getArrivalDate()
						+ ", Available Seats: " + flight.getAvailableSeatCount());
			}
		}
	}

	public void searchBooking(String departureLocation, String arrivalLocation, Date departureDate, Date returnDate) {
		ArrayList<Flight> flights = new ArrayList<Flight>();

		for (Airline airline : airlines) {
			for (Flight flight : airline.getOperatedFlights()) {
				if (flight.getDepartureCity().equalsIgnoreCase(departureLocation)
						&& flight.getArrivalCity().equalsIgnoreCase(arrivalLocation)
						&& flight.getDepartureDate().equals(departureDate)) {
					flights.add(flight);
				}
			}
		}
		if (flights.isEmpty()) {
			System.out.println("No flights found for the given route and dates.");
		} else {
			System.out.println("Available flights:");
			for (Flight flight : flights) {
				System.out.println("Flight Number: " + flight.getFlightNumber() + ", Departure Date: "
						+ flight.getDepartureDate() + ", Arrival Date: " + flight.getArrivalDate()
						+ ", Available Seats: " + flight.getAvailableSeatCount());
			}
		}
	}

	public void listAllFlights() {
		ArrayList<Flight> flights = new ArrayList<Flight>();

		for (Airline airline : airlines) {
			for (Flight flight : airline.getOperatedFlights()) {
				flights.add(flight);
			}
		}
		if (flights.isEmpty()) {
			System.out.println("No flights available.");
		} else {
			System.out.println("All available flights:");
			for (Flight flight : flights) {
				System.out.println("Flight Number: " + flight.getFlightNumber() + ", Departure Date: "
						+ flight.getDepartureDate() + ", Arrival Date: " + flight.getArrivalDate()
						+ ", Available Seats: " + flight.getAvailableSeatCount());
			}
		}
	}
}
