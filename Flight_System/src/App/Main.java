package App;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import Domain.Entitites.*;
import UseCase.Customer.FlightSearcher;
import UseCase.Customer.StandardBookingManager;
import UseCase.Staff.*;

public class Main {

	public static void main(String[] args) throws Exception {
		// Initialize the application with a list of airlines
		ArrayList<Airline> airlines = new ArrayList<>();
		Customer customer = null;
		initApp(airlines);
		initCustomer(customer); // Mocks a customer for testing
		boolean isRunning = true;
		// Show Main Menu - Customer
		while (isRunning) {
			System.out.println("--- Welcome to DohAir Flight Booking System ---");
			System.out.println("Please select an option:");
			System.out.println("1. Search Flights");
			System.out.println("2. Book a Flight");
			System.out.println("3. Cancel a Flight");
			System.out.println("4. View Booking History");
			System.out.println("5. Exit");
			System.out.println();
			System.out.print("Enter your choice: ");

			int choice = 0;

			try {
				choice = Integer.parseInt(System.console().readLine());
			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Please enter a number between 1 and 5.");
				continue;
			}
			switch (choice) {
				case 1:
					// Search Flights
					FlightSearcher flightSearcher = new FlightSearcher(airlines);
					System.out.println("--- Search Flights ---");
					System.out.print("Where do you want to go? (Type ALL if you want to list all flights)");
					String departureLocation = System.console().readLine();
					if (departureLocation.equalsIgnoreCase("ALL")) {
						System.out.println("Listing all flights...");
						// Call the method to list all flights here
						flightSearcher.listAllFlights();
						break;
					}

					System.out.print("Where are you coming from? (Default: ALL) ");
					String arrivalLocation = System.console().readLine();
					System.out.print("What is your departure date? [yyyy-mm-dd] (Default: TODAY) ");
					String departureDate = System.console().readLine();
					System.out.print("What is your arrival date? (Default: ALL) ");
					String arrivalDate = System.console().readLine();

					// Call the search flight method here
					flightSearcher.searchBooking();

					break;
				case 2:
					// Book a Flight
					StandardBookingManager stBM = new StandardBookingManager(customer);
					System.out.println("Booking a flight...");
					System.out.print("Enter the flight number: ");
					String flightNumber = System.console().readLine();
					System.out.print("Enter the number of passengers: ");
					int numberOfPassengers = 0;
					try {
						numberOfPassengers = Integer.parseInt(System.console().readLine());
					} catch (NumberFormatException e) {
						System.out.println("Invalid input. Please enter a valid number of passengers.");
						continue;
					}
					for (int i = 0; i < numberOfPassengers; i++) {
						System.out.print("Enter passenger " + (i + 1) + " name: ");
						String passengerName = System.console().readLine();
						System.out.print("Enter Seat Class (Economy, Business): ");
						String seatClass = System.console().readLine();
						System.out.print("Enter perferred Seat Number: ");
						String seatNumber = System.console().readLine();
						// Call the book flight method here

					}
					// Call the book flight method here
					break;
				case 3:
					// Cancel a Flight
					System.out.println("Cancelling a flight...");
					// Call the cancel flight method here
					break;
				case 4:
					// View Booking History
					System.out.println("Viewing booking history...");
					// Call the view booking history method here
					break;
				case 5:
					// Exit the application
					System.out.println("Exiting the application. Thank you for using DohAir Flight Booking System.");
					isRunning = false;
					break;
				default:
					System.out.println("Invalid choice. Please select a valid option (1-5).");
					break;
			}
			System.out.println();
		}

	}

	public static void initCustomer(Customer customer) {
		// Initialize the customer with a list of airlines and their flights.
		// This method is currently empty and can be implemented later.
		customer = new Customer("john.doe", "John Doe", "johndoe@gmail.com", "1234567890",
				"123 Main St, City, Country");

	}

	// This method initializes the application with a list of airlines and their
	// flights.
	public static void initApp(ArrayList<Airline> airlines) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

		Airline QTR = new Airline("Qatar Airways", "QR");
		FlightManager flightManager = new FlightManager(QTR);
		flightManager.addFlight("Doha", "London", dateFormat.parse("2025-04-11 14:30"),
				dateFormat.parse("2025-04-12 02:00"), 200, 2800.00);
		flightManager.addFlight("Doha", "New York", dateFormat.parse("2025-04-15 06:15"),
				dateFormat.parse("2025-04-16 08:30"), 200, 3500.00);
		flightManager.addFlight("Doha", "Tokyo", dateFormat.parse("2025-04-20 13:00"),
				dateFormat.parse("2025-04-20 06:30"), 200, 4000.00);
		flightManager.addFlight("Paris", "Doha", dateFormat.parse("2025-04-25 10:00"),
				dateFormat.parse("2025-04-25 18:30"), 200, 2500.00);

		airlines.add(QTR);

		Airline Emirates = new Airline("Emirates", "EK");
		FlightManager flightManager2 = new FlightManager(Emirates);
		flightManager2.addFlight("Dubai", "London", dateFormat.parse("2025-04-12 15:00"),
				dateFormat.parse("2025-04-13 02:30"), 200, 3000.00);
		flightManager2.addFlight("Dubai", "New York", dateFormat.parse("2025-04-16 07:00"),
				dateFormat.parse("2025-04-17 09:15"), 200, 3700.00);
		flightManager2.addFlight("Dubai", "Tokyo", dateFormat.parse("2025-04-21 14:00"),
				dateFormat.parse("2025-04-21 07:30"), 200, 4200.00);
		flightManager2.addFlight("London", "Dubai", dateFormat.parse("2025-04-26 11:00"),
				dateFormat.parse("2025-04-26 19:30"), 200, 2800.00);

		airlines.add(Emirates);

		Airline AirFrance = new Airline("Air France", "AF");
		FlightManager flightManager3 = new FlightManager(AirFrance);
		flightManager3.addFlight("Paris", "London", dateFormat.parse("2025-04-13 16:00"),
				dateFormat.parse("2025-04-13 17:30"), 200, 150.00);
		flightManager3.addFlight("Paris", "New York", dateFormat.parse("2025-04-17 08:00"),
				dateFormat.parse("2025-04-18 10:15"), 200, 2000.00);
		flightManager3.addFlight("Paris", "Tokyo", dateFormat.parse("2025-04-22 12:00"),
				dateFormat.parse("2025-04-22 05:30"), 200, 2500.00);
		flightManager3.addFlight("Tokyo", "Paris", dateFormat.parse("2025-04-27 09:00"),
				dateFormat.parse("2025-04-27 17:30"), 200, 2200.00);
		flightManager3.addFlight("Doha", "Paris", dateFormat.parse("2025-04-25 10:00"),
				dateFormat.parse("2025-04-25 18:30"), 200, 2500.00);
		flightManager3.addFlight("Paris", "Doha", dateFormat.parse("2025-04-26 11:00"),
				dateFormat.parse("2025-04-26 19:30"), 200, 2800.00);
		flightManager3.addFlight("Dubai", "Paris", dateFormat.parse("2025-04-27 12:00"),
				dateFormat.parse("2025-04-27 20:30"), 200, 3000.00);

		airlines.add(AirFrance);
		System.out.println("Application initialized with " + airlines.size() + " airlines.");

	}

}
