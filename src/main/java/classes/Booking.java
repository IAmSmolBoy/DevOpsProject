package classes;

import java.sql.Date;

public class Booking {
	private String bookerName;
	private String hotelName;
	private Date checkInDate;
	private Date checkOutDate;
	
	public Booking(String bookerName, String hotelName, Date checkInDate, Date checkOutDate) {
		super();
		this.bookerName = bookerName;
		this.hotelName = hotelName;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
	}
}