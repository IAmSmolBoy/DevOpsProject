package classes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import classes.User;
import classes.UserCollection;

class UserCollectionTest {
	
	private UserCollection uc;
	private User u1;
	private User u2;
	private User u3;
	private User u4;
	private final int USER_COLLECTION_SIZE = 4;
	private ArrayList<User> users = new ArrayList<>();

	@BeforeEach
	void setUp() throws Exception {
		uc = new UserCollection();
		u1 = new User("Aloy","Aloysius@gmail.com", "1234");
		u2 = new User("Roy","Roy@gmail.com", "12345");
		u3 = new User("Hong Rui","HR@gmail.com", "12346");
		u4 = new User("Marco","Marco@gmail.com", "12347");
		uc.adduser(u1);
		uc.adduser(u2);
		uc.adduser(u3);
		uc.adduser(u4);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetusers() {
		List<User> testUc = uc.getusers();
		assertEquals(testUc.size(), USER_COLLECTION_SIZE);
		return;
	}

	@Test
	void testAdduser() {
		List<User> testUc = uc.getusers();
		assertEquals(testUc.size(), USER_COLLECTION_SIZE);
		uc.adduser(u1);
		assertEquals(uc.getusers().size(), USER_COLLECTION_SIZE+1);
	}
	

	@Test
	void testEdituser() {
		List<User> testUc = uc.getusers();
		assertEquals(testUc.size(), USER_COLLECTION_SIZE);
		int indexedit = 0;
		User edituser = new User("Aloy2", "Aloy2@gmail.com", "234");
		uc.edituser(indexedit, edituser);
		assertEquals(uc.getusers().get(indexedit), edituser);
	}

	@Test
	void testDeleteuser() {
		List<User> testUc = uc.getusers();
		int indexdelete = 0;
		uc.deleteuser(indexdelete);
		assertEquals(uc.getusers().size(), USER_COLLECTION_SIZE-1);
	
	}

}
