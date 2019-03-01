package com.jb.ticket;


// Want this class to be abstract so that we don't start objects of the type ticket. We want all ticket type objects to be a subclass of this
public abstract class Ticket {
	
	// All tickets ID will come from this.
	public static int TICKET_ID = 1;
	
	// Protected means that only this class and the subclasses can access.
	protected int ticket_ID;
	protected int price; // ticket price
	
	// Constructor
	public Ticket() {
		price = 50; // This is the default price for tickets when they are created
		ticket_ID = Ticket.TICKET_ID; // Get ticket ID;
		Ticket.TICKET_ID++; // increase ticket counter by 1
	}
	
	
	// Returns the price
	public int getPrice() {
		return price;
	}
	
	// Sets the price
	public void setPrice(int price) {
		this.price = price;
	}
	
	// Get the ticket ID
	public int getTicketID() {
		return ticket_ID;
	}
	
	
	// To String
	@Override
	public String toString() {
		return "Price of Ticket: " + price + " Ticket Number: " + ticket_ID +"\n";
	}
}
