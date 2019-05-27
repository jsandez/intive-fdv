package sandez.com.intive.rents;

import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;

import org.junit.Test;

import sandez.com.intive.model.Rent;

public class RentByWeekTest {

	@Test
	public void rentByWeekTest() {

		RentType rentType = new RentByWeek();
		LocalDateTime endDate = LocalDateTime.now().plusWeeks(3).plusMinutes(1);
		Rent rent = new Rent();
		rent.setStartDate(LocalDateTime.now());
		rent.setEndDate(endDate);
		double charge = rentType.charge(rent);
		assertTrue(charge == 180.0);
	}

}
