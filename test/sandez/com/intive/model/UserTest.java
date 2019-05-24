package sandez.com.intive.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.Test;

public class UserTest {

	@Test
	public void newUserTest() {
		User uTest = new User();

		uTest.setUserId("1");
		uTest.setRents(new ArrayList<Rent>());

		assertEquals(uTest.getUserId(), "1");
		assertNotNull(uTest.getRents());
	}

}
