import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import classes.Booking;
import classes.BookingCollection;

class BookingCollectionTest {
	private BookingCollection bc;
	private Booking b1;
	private Booking b2;
	private Booking b3;
	private Booking b4;
	private final int BOOKING_COLLECTION_SIZE = 4;

	@BeforeEach
	void setUp() throws Exception {
		bc = new BookingCollection();
		b1 = new Booking("Aloy","Marina Bay", null, null);
		b2 = new Booking("Marco","Marina Bay", null, null);
		b3 = new Booking("Roy","Marina Bay", null, null);
		b4 = new Booking("HR","Marina Bay", null, null);
		bc.addbooking(b1);
		bc.addbooking(b2);
		bc.addbooking(b3);
		bc.addbooking(b4);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetbookings() {
		List<Booking> testBc = bc.getbookings();
		assertEquals(testBc.size(), BOOKING_COLLECTION_SIZE);
		return;
	}

	@Test
	void testAddbooking() {
		List<Booking> testBc = bc.getbookings();
		assertEquals(testBc.size(), BOOKING_COLLECTION_SIZE);
		bc.addbooking(b1);
		assertEquals(bc.getbookings().size(), BOOKING_COLLECTION_SIZE+1);
	}
	
	@Test
	void testEditbooking() {
		List<Booking> testBc = bc.getbookings();
		assertEquals(testBc.size(), BOOKING_COLLECTION_SIZE);
		int indexedit = 0;
		Booking editbooking = new Booking("Aloy2", "Marina Bay", null, null);
		bc.editbooking(indexedit, editbooking);
		assertEquals(bc.getbookings().get(indexedit), editbooking);
	}

	@Test
	void testDeletebooking() {
		List<Booking> testBc = bc.getbookings();
		int indexdelete = 0;
		bc.deletebooking(indexdelete);
		assertEquals(bc.getbookings().size(), BOOKING_COLLECTION_SIZE-1);
	
	}


}
