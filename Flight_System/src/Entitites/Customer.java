package Entitites;

public class Customer {
	public String customerID;
	public String name;
	public String email;
	public String phoneNumber;
	public String address;

	// Constructor
	public Customer(String customerID, String name, String email, String phoneNumber, String address) {
		this.customerID = customerID;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

}
