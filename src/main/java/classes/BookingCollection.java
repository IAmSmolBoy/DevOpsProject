package classes;

import java.util.ArrayList;

public class BookingCollection {
	private ArrayList<Booking> bookings;

	public BookingCollection(ArrayList<Booking> bookings) {
		super();
		this.bookings = bookings;
	}

	public ArrayList<Booking> getbookings() {
		return bookings;
	}

	public void setbookings(ArrayList<Booking> bookings) {
		this.bookings = bookings;
	}
	
	public void addbooking(Booking booking) {
		bookings.add(booking);
	}
	
	public void editbooking(int index, Booking booking) {
		bookings.set(index, booking);
	}
	
	public void deletebooking(int index) {
		bookings.remove(index);
	}
	
}