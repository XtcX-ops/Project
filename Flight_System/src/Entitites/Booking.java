package Entitites;

public class Booking {
	private String bookingID;
	private String customerID;
	private String flightNumber;
	private String seatNumber;
	private String bookingDate;
	private String status; // e.g., "confirmed", "cancelled", etc.
	private double totalPrice; // Total price of the booking

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

	public String getBookingID() {
		return bookingID;
	}

	public void getBookingDetails() {
		System.out.println("Booking ID: " + bookingID);
		System.out.println("Customer ID: " + customerID);
		System.out.println("Flight Number: " + flightNumber);
		System.out.println("Seat Number: " + seatNumber);
		System.out.println("Booking Date: " + bookingDate);
		System.out.println("Status: " + status);
		System.out.println("Total Price: $" + totalPrice);
	}
}
