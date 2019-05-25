package sandez.com.intive.rents;

import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;

import org.junit.Test;

public class RentByWeekTest {

	@Test
	public void rentByWeekTest() {
		RentType rent = new RentByWeek(LocalDateTime.now());
		LocalDateTime endDate = LocalDateTime.now().plusWeeks(3);
		double charge = rent.charge(endDate);
		assertTrue(charge == 180.0);
	}

}
