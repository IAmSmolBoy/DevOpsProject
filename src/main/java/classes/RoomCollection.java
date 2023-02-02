package classes;

import java.util.ArrayList;

public class RoomCollection {
	private ArrayList<Room> rooms;

	public RoomCollection(ArrayList<Room> rooms) {
		super();
		this.rooms = rooms;
	}

	public ArrayList<Room> getRooms() {
		return rooms;
	}

	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}
	
	public void addRoom(Room room) {
		rooms.add(room);
	}
	
	public void editRoom(int index, Room room) {
		rooms.set(index, room);
	}
	
	public void deleteRoom(int index) {
		rooms.remove(index);
	}
	
}