package classes;

import java.util.ArrayList;
import java.util.List;

public class UserCollection {
	private ArrayList<User> users = new ArrayList<>();
	private int capacity;
//	public UserCollection(ArrayList<User> users) {
//		super();
//		this.users = users;
//	}
	
	public UserCollection() {
		this.capacity = 5;
	}
	
	public List<User> getusers() {
		return users;
	}
	
	public void adduser(User user) {
		if(users.size() != capacity) {
			users.add(user);
		}
	}
	
	public void edituser(int index, User user) {
		users.set(index, user);
	}
	
	public void deleteuser(int index) {
		users.remove(index);
	}
	
}