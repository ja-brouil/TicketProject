package com.jb.ticket;

import java.util.ArrayList;

public class Test {

	// Test with different tickets
	public static void main(String[] args) {
		
		// ArrayList of tickets to hold all types of Tickets
		// What does this mean? This is where polymorphism comes into play. Since Ticket is the masterclass, anything that inherits from this class is ALSO a ticket.
		// Let's see this example with animals.
		// Let's say you have a super class called Dog.
		// And now you have two subclasses called Shiba Inu and Labrador. Both of these classes extend from Dog.
		// You can say: All Shiba Inu and Labrador are DOGS but Shiba Inus are NOT Labradors.
		// Another Example:
		// Super class: Vehicle
		// Subclass: Car, Truck, Bike
		// Every car, truck and bike are VEHICLES but cars are NOT trucks.
		ArrayList<Ticket> allTickets = new ArrayList<>();
		
		// Add Some tickets
		allTickets.add(new SameDayTicket()); // Add default standard ticket
		allTickets.add(new StudentAdvanceTicket(15)); // Student ticket bought 15 days ahead of time -> should be $30 / 2 so the price should be $15
		allTickets.add(new AdvanceTicket(5)); // Regular advance day ticket -> less than 10 days bought ahead so price should be $40
		
		// Loop through all the tickets and print their values
		for (int i = 0; i < allTickets.size(); i++) {
			System.out.print(allTickets.get(i).toString());
		}
	}
}
