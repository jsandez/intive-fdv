package sandez.com.intive.rents;

import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;

import org.junit.Test;

public class RentByDayTest {

	@Test
	public void rentByDayTest() {
		RentType rent = new RentByDay(LocalDateTime.now());
		LocalDateTime endDate = LocalDateTime.now().plusDays(2);
		double charge = rent.charge(endDate);
		assertTrue(charge == 40.0);
	}

}
