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

	public String getTicketID() {
		return ticketID;
	}

	public Flight getFlight() {
		return flight;
	}

	public Customer getCustomer() {
		return customer;
	}

	public Seat getSeat() {
		return seat;
	}

	public void getTicketDetails() {
		System.out.println("Ticket ID: " + ticketID);
		System.out.println("Flight Number: " + flight.getFlightNumber());
		System.out.println("Customer ID: " + customer.getCustomerID());
		System.out.println("Seat Number: " + seat.getSeatNumber());
		System.out.println("Status: " + seat.getStatus());
	}

}
