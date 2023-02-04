import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import classes.Room;
import servlets.SQLConnection;

class RoomsTest {

	final SQLConnection queries = new SQLConnection();
	final ArrayList<Room> rooms = new ArrayList<Room>();;
	int originalTableSize = 0;
	
	@BeforeEach
	void setUp() throws Exception {
		final SQLConnection queries = new SQLConnection();
		final ArrayList<Map<String, Object>> getTableResult = queries.getTable("rooms");
		for (Map<String, Object> room : getTableResult) {
			rooms.add(new Room(
				(String) room.get("roomName"),
				(int) room.get("rate"),
				(int) room.get("price"),
				(String) room.get("img"),
				(String) room.get("description")
			));
		}
		originalTableSize = rooms.size();
	}

	@AfterEach
	void tearDown() throws Exception {
		rooms.clear();
	}

	@Test
	void testAddToRoomsTable() {
		Room room = new Room(
			"Hotel 2",
			3,
			100,
			"https://www.gannett-cdn.com/-mm-/05b227ad5b8ad4e9dcb53af4f31d7fbdb7fa901b/c=0-64-2119-1259/local/-/media/USATODAY/USATODAY/2014/08/13/1407953244000-177513283.jpg",
			"This hotel is ok"
		);
		
		ArrayList<Map<String,Object>> newTable = null;
		try {
			queries.addToTable("rooms", room.toParameterMap());
			newTable = queries.getTable("rooms");
		} catch (SQLException | IOException | ServletException e) {
			e.printStackTrace();
		}
//		
		if (newTable != null) {
			assertEquals(newTable.size(), originalTableSize + 1);
			
			assertEquals(newTable.get(originalTableSize), room.toMap());
		}
	}

	@Test
	void testEditElement() {
		Room room = new Room(
			"Hotel 3",
			4,
			150,
			"https://cdn.loewshotels.com/loewshotels.com-2466770763/cms/cache/v2/5f5a6e0d12749.jpg/1920x1080/fit/80/86e685af18659ee9ecca35c465603812.jpg",
			"This hotel is quite good"
		);
		
		ArrayList<Map<String,Object>> newTable = null;
		try {
			queries.editElement("rooms", room.toParameterMap());
			newTable = queries.getTable("rooms");
		} catch (SQLException | IOException | ServletException e) {
			e.printStackTrace();
		}
//		
		if (newTable != null) {
			assertEquals(newTable.size(), originalTableSize);
			
			assertEquals(newTable.get(originalTableSize - 1), room.toMap());
		}
	}

	@Test
	void testDeleteFromTable() {
		Room room = new Room(
			"Hotel 3",
			4,
			150,
			"https://cdn.loewshotels.com/loewshotels.com-2466770763/cms/cache/v2/5f5a6e0d12749.jpg/1920x1080/fit/80/86e685af18659ee9ecca35c465603812.jpg",
			"This hotel is quite good"
		);
		
		ArrayList<Map<String,Object>> newTable = null;
		Map<String, String[]> roomKeyAttr = new HashMap<String, String[]>();
		roomKeyAttr.put("roomName", new String[] { room.getRoomName() });
		
		try {
			queries.deleteFromTable("rooms", roomKeyAttr);
			newTable = queries.getTable("rooms");
		} catch (SQLException | IOException | ServletException e) {
			e.printStackTrace();
		}
//		
		if (newTable != null) {
			assertEquals(newTable.size(), originalTableSize - 1);
		}
	}

}
