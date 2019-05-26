package sandez.com.intive.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
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
		rent.setRentType(new RentByDay());
		rent.setUserId("1");
		rent.setStartDate(LocalDateTime.now());
		rent.setEndDate(LocalDateTime.now().plusDays(2));

		assertTrue(rent.getPrice() == 0);
		assertEquals(rent.getRentId(), "1");
		assertEquals(rent.getUserId(), "1");
		assertNotNull(rent.getRentType());
		assertTrue(rent.getStartDate().equals(LocalDateTime.now()));
		assertTrue(rent.getEndDate().equals(LocalDateTime.now().plusDays(2)));
	}

}
