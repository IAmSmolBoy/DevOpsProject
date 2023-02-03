package classes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserCollectionTest {
	private UserCollection uc;
	private User u1;
	private User u2;
	private User u3;
	private User u4;
	private final int USER_COLLECTION_SIZE = 4;

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
	void testUserCollection() {
		fail("Not yet implemented");
	}

	@Test
	void testGetusers() {
		List<User> testUc = uc.getusers();
		return;
	}

	@Test
	void testSetusers() {
		List<User> testBc = uc.getusers();
		assertEquals(testBc.size(), USER_COLLECTION_SIZE);
		uc.adduser(u1);
		assertEquals(uc.getusers().size(), USER_COLLECTION_SIZE+1);
	}

	@Test
	void testAdduser() {
		fail("Not yet implemented");
	}

	@Test
	void testEdituser() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteuser() {
		fail("Not yet implemented");
	}

}
