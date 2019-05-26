package sandez.com.intive.service.impl;

import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import sandez.com.intive.model.Rent;
import sandez.com.intive.model.User;
import sandez.com.intive.rents.RentByDay;
import sandez.com.intive.rents.RentByHour;
import sandez.com.intive.rents.RentByWeek;
import sandez.com.intive.service.RentService;

public class RentServiceImplTest {

	@Test
	public void chargeUserApplyDiscountTest() {
		User uTest = new User();
		uTest.setUserId("1");

		Rent rentA = new Rent();
		rentA.setPrice(0);
		rentA.setRentType(new RentByDay());
		rentA.setUserId("1");
		rentA.setRentId("1");
		rentA.setStartDate(LocalDateTime.now());
		rentA.setEndDate(LocalDateTime.now().plusDays(2));

		Rent rentB = new Rent();
		rentB.setPrice(0);
		rentB.setRentType(new RentByHour());
		rentB.setUserId("1");
		rentB.setRentId("2");
		rentB.setStartDate(LocalDateTime.now());
		rentB.setEndDate(LocalDateTime.now().plusHours(3));

		Rent rentC = new Rent();
		rentC.setPrice(0);
		rentC.setRentType(new RentByWeek());
		rentC.setUserId("1");
		rentC.setRentId("3");
		rentC.setStartDate(LocalDateTime.now());
		rentC.setEndDate(LocalDateTime.now().plusWeeks(4));

		List<Rent> rents = new ArrayList<Rent>();
		rents.add(rentA);
		rents.add(rentB);
		rents.add(rentC);

		uTest.setRents(rents);

		RentService rentService = new RentServiceImpl();
		double totalPrice = rentService.chargeUser(uTest);
		assertTrue(totalPrice == 206.5);
	}
	
	@Test
	public void chargeUserNotApplyDiscountTest() {
		User uTest = new User();
		uTest.setUserId("1");

		Rent rentA = new Rent();
		rentA.setPrice(0);
		rentA.setRentType(new RentByDay());
		rentA.setUserId("1");
		rentA.setRentId("1");
		rentA.setStartDate(LocalDateTime.now());
		rentA.setEndDate(LocalDateTime.now().plusDays(2));

		Rent rentB = new Rent();
		rentB.setPrice(0);
		rentB.setRentType(new RentByHour());
		rentB.setUserId("1");
		rentB.setRentId("2");
		rentB.setStartDate(LocalDateTime.now());
		rentB.setEndDate(LocalDateTime.now().plusHours(3));

		List<Rent> rents = new ArrayList<Rent>();
		rents.add(rentA);
		rents.add(rentB);

		uTest.setRents(rents);

		RentService rentService = new RentServiceImpl();
		double totalPrice = rentService.chargeUser(uTest);
		assertTrue(totalPrice == 55.0);
	}

}
