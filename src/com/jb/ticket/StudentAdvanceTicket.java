package com.jb.ticket;

public class StudentAdvanceTicket extends AdvanceTicket{

	// Since we are inheriting from the advance ticket, we must have the SAME parameters from that class as a MINIMUM
	public StudentAdvanceTicket(int numberOfDaysAdvance) {
		super(numberOfDaysAdvance); // Call the advance ticket constructor which will then call the ticket constructor
		
		// We need to calculate the final cost for students
		super.setPrice(super.getPrice() / 2); // Get the price of the Advance Ticket, then divide it by two and set this number as the new price
	}

	
	// We are done, we don't need anything more
}
