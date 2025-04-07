package Entitites;

public class Seat {
	private String seatNumber;
	private String seatClass;
	private String status; // Available, Booked, etc.
	private double price;

	// Constructor
	public Seat(String seatNumber, String seatClass, String status, double price) {
		this.seatNumber = seatNumber;
		this.seatClass = seatClass;
		this.status = status;
		this.price = price;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public String getSeatClass() {
		return seatClass;
	}

	public String getStatus() {
		return status;
	}

	public double getPrice() {
		return price;
	}

	private void setStatus(String status) {
		this.status = status;
	}

	public void bookSeat() {
		if (status.equals("Available")) {
			setStatus("Booked");
		} else {
			System.out.println("Seat is already booked.");
		}
	}

	public void cancelSeat() {
		if (status.equals("Booked")) {
			setStatus("Available");
		} else {
			System.out.println("Seat is not booked.");
		}
	}
}
