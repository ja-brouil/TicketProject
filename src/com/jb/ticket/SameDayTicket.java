package com.jb.ticket;

public class SameDayTicket extends Ticket{
	
	
	public SameDayTicket() {
		super(); // Doing this calls the Ticket constructor which will do the instructions in the ticket constructor.
	}
	
	// We don't need anything more here since by default, tickets are $50 and we have a ticket ID already.
}
