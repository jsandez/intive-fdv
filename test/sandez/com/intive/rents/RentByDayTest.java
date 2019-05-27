package sandez.com.intive.rents;

import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;

import org.junit.Test;

import sandez.com.intive.model.Rent;

public class RentByDayTest {

	@Test
	public void rentByDayTest() {
		RentType rentType = new RentByDay();
		LocalDateTime endDate = LocalDateTime.now().plusDays(2).plusMinutes(1);
		Rent rent = new Rent();
		rent.setStartDate(LocalDateTime.now());
		rent.setEndDate(endDate);
		double charge = rentType.charge(rent);
		assertTrue(charge == 40.0);
	}

}
