package sandez.com.intive.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;

import org.junit.Test;

import sandez.com.intive.rents.RentByDay;

public class RentTest {

	@Test
	public void newRentTest() {
		Rent rent = new Rent();
		rent.setPrice(0);
		rent.setRentId("1");
		rent.setRentType(new RentByDay(LocalDateTime.now()));
		rent.setUserId("1");

		assertTrue(rent.getPrice() == 0);
		assertEquals(rent.getRentId(), "1");
		assertEquals(rent.getUserId(), "1");
	}

}
