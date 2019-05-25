package sandez.com.intive.service.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import sandez.com.intive.model.Rent;
import sandez.com.intive.model.User;
import sandez.com.intive.rents.RentByDay;
import sandez.com.intive.rents.RentByHour;
import sandez.com.intive.service.RentService;

public class RentServiceImplTest {

	@Test
	public void chargeUserTest() {
		User uTest = new User();
		uTest.setUserId("1");

		Rent rentA = new Rent();
		rentA.setPrice(0);
		rentA.setRentType(new RentByDay(LocalDateTime.now()));
		rentA.setUserId("1");
		rentA.setRentId("1");

		Rent rentB = new Rent();
		rentA.setPrice(0);
		rentA.setRentType(new RentByHour(LocalDateTime.now()));
		rentA.setUserId("1");
		rentA.setRentId("2");

		Rent rentC = new Rent();
		rentC.setPrice(0);
		rentC.setRentType(new RentByHour(LocalDateTime.now()));
		rentC.setUserId("1");
		rentC.setRentId("3");

		List<Rent> rents = new ArrayList<Rent>();
		rents.add(rentA);
		rents.add(rentB);
		rents.add(rentC);

		uTest.setRents(rents);

		LocalDateTime endDate = LocalDateTime.now();
		RentService rentService = new RentServiceImpl();
		rentService.chargeUser(uTest, endDate);
	}

}
