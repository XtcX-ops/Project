package Entitites;

import java.util.ArrayList;
import java.util.Objects;

public class Customer {
	private int customer_id;
	private String firstName;
	private String lastName;
	private String paymentInfo;
	private String address;
	private String phone;
	private ArrayList<Booking> bookings;
	public Customer(int customer_id, String firstName, String lastName, String paymentInfo, String address,
			String phone) {
		super();
		this.customer_id = customer_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.paymentInfo = paymentInfo;
		this.address = address;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", paymentInfo=" + paymentInfo + ", address=" + address + ", phone=" + phone + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(customer_id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(customer_id, other.customer_id);
	}
	
	
}
