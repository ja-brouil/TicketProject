package com.jb.ticket;

public class AdvanceTicket extends Ticket{
	
	// Constant threshold for the advanced days
	private static final int MIN_ADVANCED_DAYS = 10;
	
	private int numberOfDaysAdvance;
	
	public AdvanceTicket(int numberOfDaysAdvance) {
		super(); // call super class to get the ticket id and set default ticket price to 50
		this.numberOfDaysAdvance = numberOfDaysAdvance;
		
		// Calculate ticket price based on how many days
		if (numberOfDaysAdvance >= MIN_ADVANCED_DAYS) {
			super.price = 30; // More than 10 days = $30
		} else if (numberOfDaysAdvance < 10 && numberOfDaysAdvance > 0) { // less than 10 days but more than than 0, ie day of the event)
			super.price = 40;
		}
	}
	
	
	// Get number of days adv
	public int getNumberOfDaysAdvance() {
		return numberOfDaysAdvance;
	}
}
