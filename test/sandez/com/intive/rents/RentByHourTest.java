package sandez.com.intive.rents;

import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;

import org.junit.Test;

public class RentByHourTest {

	@Test
	public void rentByHourTest() {
		RentType rent = new RentByHour(LocalDateTime.now());
		LocalDateTime endDate = LocalDateTime.now().plusHours(5);
		double charge = rent.charge(endDate);
		assertTrue(charge == 25.0);
	}

}
