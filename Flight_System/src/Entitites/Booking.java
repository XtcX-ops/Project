package Entitites;

public class Booking {
	public String bookingID;
	public String customerID;
	public String flightNumber;
	public String seatNumber;
	public String bookingDate;
	public String status; // e.g., "confirmed", "cancelled", etc.
	public double totalPrice; // Total price of the booking

	// Constructor
	public Booking(String bookingID, String customerID, String flightNumber, String seatNumber, String bookingDate,
			String status, double totalPrice) {
		this.bookingID = bookingID;
		this.customerID = customerID;
		this.flightNumber = flightNumber;
		this.seatNumber = seatNumber;
		this.bookingDate = bookingDate;
		this.status = status;
		this.totalPrice = totalPrice;
	}
}
