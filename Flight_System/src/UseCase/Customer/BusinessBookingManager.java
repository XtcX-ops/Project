package UseCase.Customer;

import java.util.Date;

import Domain.Entitites.Booking;
import Domain.Entitites.Customer;

public class BusinessBookingManager implements iBookingManager {

	private Customer customer;

	public BusinessBookingManager(Customer customer) {
		this.customer = customer;
	}

	@Override
	public Booking getBookingDetails(String bookingID) {
		for (Booking booking : customer.getBookings()) {
			if (booking.getBookingID().equals(bookingID)) {
				return booking;
			}
		}
		return null; // Booking not found
	}

	@Override
	public Booking[] getAllBookingsByCustomer() {
		Booking[] bookings = new Booking[customer.getBookings().size()];
		for (int i = 0; i < customer.getBookings().size(); i++) {
			bookings[i] = customer.getBookings().get(i);
		}
		return bookings;
	}

	@Override
	public Booking[] getAllBookingsByDate(Date date) {
		Booking[] bookings = new Booking[customer.getBookings().size()];
		int count = 0;
		for (Booking booking : customer.getBookings()) {
			if (booking.getBookingDate().equals(date)) {
				bookings[count] = booking;
				count++;
			}
		}
		Booking[] filteredBookings = new Booking[count];
		System.arraycopy(bookings, 0, filteredBookings, 0, count);
		return filteredBookings;

	}

}
