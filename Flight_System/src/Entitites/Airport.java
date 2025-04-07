package Entitites;

public class Airport {
	private String airportCode;
	private String airportName;
	private String city;
	private String country;

	// Constructor
	public Airport(String airportCode, String airportName, String city, String country) {
		this.airportCode = airportCode;
		this.airportName = airportName;
		this.city = city;
		this.country = country;
	}

	public String getAirportCode() {
		return airportCode;
	}

	public String getAirportName() {
		return airportName;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

}
