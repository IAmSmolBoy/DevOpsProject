package classes;

import java.util.ArrayList;
import java.util.List;

public class BookingCollection {
	private ArrayList<Booking> bookings = new ArrayList<>();
	private int capacity;

//	public BookingCollection(ArrayList<Booking> bookings) {
//		super();
//		this.bookings = bookings;
//		this.capacity = 5;
//
//	}
	
	public BookingCollection() {
		this.capacity = 5;
	}
	
	public BookingCollection(int capacity) {
		this.capacity = capacity;
	}

	public List<Booking> getbookings() {
		return bookings;
	}

	public void setbookings(ArrayList<Booking> bookings) {
		this.bookings = bookings;
	}
	
	public void addbooking(Booking booking) {
		if(bookings.size() != capacity) {
			bookings.add(booking);
		}
	}
	
	public void editbooking(int index, Booking booking) {
		bookings.set(index, booking);
	}
	
	public void deletebooking(int index) {
		bookings.remove(index);
	}
	
}