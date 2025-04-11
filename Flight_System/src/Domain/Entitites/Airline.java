package Domain.Entitites;

import java.util.ArrayList;

public class Airline {
	private String airlineCode;
	private String airlineName;
	private ArrayList<Flight> operatedFlights;

	// Constructor
	public Airline(String airlineCode, String airlineName) {
		this.airlineCode = airlineCode;
		this.airlineName = airlineName;
		this.operatedFlights = new ArrayList<Flight>();
	}

	public String getAirlineCode() {
		return airlineCode;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public ArrayList<Flight> getOperatedFlights() {
		return operatedFlights;
	}
}
