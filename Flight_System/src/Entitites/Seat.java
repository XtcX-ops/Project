package Entitites;

public class Seat {
	public String seatNumber;
	public String seatClass;
	public String status; // Available, Booked, etc.
	public double price;

	// Constructor
	public Seat(String seatNumber, String seatClass, String status, double price) {
		this.seatNumber = seatNumber;
		this.seatClass = seatClass;
		this.status = status;
		this.price = price;
	}
}
