package classes;

import java.util.ArrayList;

public class UserCollection {
	private ArrayList<User> users;

	public UserCollection(ArrayList<User> users) {
		super();
		this.users = users;
	}

	public ArrayList<User> getusers() {
		return users;
	}

	public void setusers(ArrayList<User> users) {
		this.users = users;
	}
	
	public void adduser(User user) {
		users.add(user);
	}
	
	public void edituser(int index, User user) {
		users.set(index, user);
	}
	
	public void deleteuser(int index) {
		users.remove(index);
	}
	
}