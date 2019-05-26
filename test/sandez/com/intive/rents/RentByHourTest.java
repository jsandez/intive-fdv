package sandez.com.intive.rents;

import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;

import org.junit.Test;

import sandez.com.intive.model.Rent;

public class RentByHourTest {

	@Test
	public void rentByHourTest() {
		
		RentType rentType = new RentByHour();
		LocalDateTime endDate = LocalDateTime.now().plusHours(5);
		Rent rent = new Rent();
		rent.setStartDate(LocalDateTime.now());
		rent.setEndDate(endDate);
		double charge = rentType.charge(rent);
		assertTrue(charge == 25.0);
	}

}
