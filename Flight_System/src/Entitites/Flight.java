package Entitites;

import java.util.Objects;

public class Flight {
	private String flightCode;
	private String origin;
	private String destination;
	private int numSeats;
	private String flightStatus;
	
	public Flight(String flightCode, String origin, String destination, int numSeats, String flightStatus) {
		super();
		this.flightCode = flightCode;
		this.origin = origin;
		this.destination = destination;
		this.numSeats = numSeats;
		this.flightStatus = flightStatus;
	}
	@Override
	public String toString() {
		return "Flight [flightCode=" + flightCode + ", origin=" + origin + ", destination=" + destination
				+ ", numSeats=" + numSeats + ", flightStatus=" + flightStatus + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(flightCode);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flight other = (Flight) obj;
		return Objects.equals(flightCode, other.flightCode);
	}
	
	
	
}
