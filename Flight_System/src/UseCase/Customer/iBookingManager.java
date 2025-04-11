package UseCase.Customer;

import java.util.Date;

import Domain.Entitites.Booking;

public interface iBookingManager {
	public Booking getBookingDetails(String bookingID);

	public Booking[] getAllBookingsByCustomer();

	public Booking[] getAllBookingsByDate(Date date);

	public void cancelBooking(String bookingID); // Method to cancel a booking
}
