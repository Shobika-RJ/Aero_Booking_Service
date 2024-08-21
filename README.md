# Flight Ticket Booking System

## Overview

This project is a simple flight ticket booking system implemented in Java using object-oriented principles. The system allows users to book and cancel tickets for flights, view passenger details, and check flight availability.

## Classes

### 1. `Flight`
This class represents a flight and contains the following attributes and methods:

- **Attributes:**
  - `int flightID`: Unique ID for the flight.
  - `int availabletickets`: Number of tickets available for booking.
  - `int remainingtickets`: Number of tickets remaining after bookings.
  - `int startingprice`: Starting price for tickets.
  - `ArrayList<String> passengerdetails`: List of passenger details.

- **Constructor:**
  - Initializes a flight with default values including 50 available tickets and a starting price of 5000.

- **Methods:**
  - `printpassengerdetails()`: Prints details of all passengers who booked tickets for the flight.
  - `printdetails()`: Prints the flight ID, available tickets, and starting price.

### 2. `BookTicket`
This class provides functionalities to book and cancel tickets for a flight.

- **Attributes:**
  - `static int price`: Stores the total price of booked tickets.
  - `static List<Integer> ticketPrices`: List of ticket prices for each booking.
  - `static List<Integer> numtickets`: List of the number of tickets booked by each passenger.
  - `static ArrayList<Integer> id1`: List of passenger IDs.

- **Methods:**
  - `booktickets(Flight currentFlight, int passengerID, int num_tickets)`: Books a specified number of tickets for a passenger on the given flight.
  - `cancelticket(Flight currentFlight, int passengerID)`: Cancels the tickets booked by a passenger.

## How to Run

1. **Setup:**
   - Ensure you have Java installed on your system.
   - Compile the Java files using `javac`:

     ```bash
     javac Flight.java BookTicket.java
     ```

2. **Execution:**
   - Run the main class that uses these classes to simulate flight ticket booking:

     ```bash
     java BookTicket
     ```

3. **Booking Tickets:**
   - The system will prompt you to book or cancel tickets and display the current status of the flight.

## Features

- **Book Tickets:** Allows booking multiple tickets at once, updates the flight's available tickets and starting price.
- **Cancel Tickets:** Cancels the booking for a specific passenger and updates the available tickets.
- **View Passenger Details:** Displays all passenger details who have booked tickets for a specific flight.

