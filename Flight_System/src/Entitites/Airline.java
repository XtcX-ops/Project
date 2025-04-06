package Entitites;

import java.util.ArrayList;

public class Airline {
	public String airlineCode;
	public String airlineName;
	public ArrayList<Flight> operatedFlights;

	// Constructor
	public Airline(String airlineCode, String airlineName) {
		this.airlineCode = airlineCode;
		this.airlineName = airlineName;
		this.operatedFlights = new ArrayList<Flight>();
	}
}
