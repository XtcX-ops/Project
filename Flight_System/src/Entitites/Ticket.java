package Entitites;

public class Ticket {
	public String ticketID;
	public Flight flight; // Reference to the flight
	public Customer customer; // Reference to the customer
	public Seat seat; // Reference to the seat

	// Constructor
	public Ticket(String ticketID, Flight flight, Customer customer, Seat seat) {
		this.ticketID = ticketID;
		this.flight = flight;
		this.customer = customer;
		this.seat = seat;
	}

}
