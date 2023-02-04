package classes;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Room {
	private String roomName;
	private int rate;
	private int price;
	private String img;
	private String description;
	
	public Room(String roomName, int rate, int price, String img, String description) {
		super();
		this.roomName = roomName;
		this.rate = rate;
		this.price = price;
		this.img = img;
		this.description = description;
	}
	
	public String getRoomName() {
		return roomName;
	}
	
	public Map<String, Object> toMap() {
		Map<String, Object> roomHashMap = new HashMap<String, Object>();
		
		for (Field field : this.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            try {
            	roomHashMap.put(
        			field.getName(),
        			field.get(this)
    			);
        	} catch (Exception e) { }
        }
		
		return roomHashMap;
	}
	
	public Map<String, String[]> toParameterMap() {
		Map<String, String[]> roomHashMap = new LinkedHashMap<String, String[]>();
		
		for (Field field : this.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            try {
            	roomHashMap.put(
        			field.getName(),
        			new String[] { String.valueOf(field.get(this)) }
    			);
        	} catch (Exception e) { }
        }
		
		return roomHashMap;
	}
	
}