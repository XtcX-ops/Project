package Entitites;

public class Customer {
	private String customerID;
	private String name;
	private String email;
	private String phoneNumber;
	private String address;

	// Constructor
	public Customer(String customerID, String name, String email, String phoneNumber, String address) {
		this.customerID = customerID;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public String getCustomerID() {
		return customerID;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void updateEmail(String newEmail) {
		this.email = newEmail;
	}

	public void updatePhoneNumber(String newPhoneNumber) {
		this.phoneNumber = newPhoneNumber;
	}

	public void updateAddress(String newAddress) {
		this.address = newAddress;
	}

	public void getCustomerDetails() {
		System.out.println("Customer ID: " + customerID);
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Address: " + address);
	}

}
