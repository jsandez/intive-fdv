package sandez.com.intive.discounts;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sandez.com.intive.model.Rent;
import sandez.com.intive.model.User;
import sandez.com.intive.rents.RentByDay;
import sandez.com.intive.rents.RentByHour;
import sandez.com.intive.rents.RentByWeek;

public class DiscountFactoryTest {

	User uTest = new User();

	@Before // setup()
	public void before() throws Exception {
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

		List<Rent> rents = new ArrayList<Rent>();
		rents.add(rentA);
		rents.add(rentB);

		uTest.setRents(rents);
	}

	@Test
	public void newDiscountFactoryNotApplyTest() {
		DiscountFactory discountFactory = new DiscountFactory();
		Discount discount = discountFactory.getDiscount(uTest);
		assertNull(discount);
	}

	@Test
	public void newDiscountFactoryApplyTest() {
		Rent rentC = new Rent();
		rentC.setPrice(0);
		rentC.setRentType(new RentByWeek(LocalDateTime.now()));
		rentC.setUserId("1");
		rentC.setRentId("3");

		uTest.getRents().add(rentC);

		DiscountFactory discountFactory = new DiscountFactory();
		Discount discount = discountFactory.getDiscount(uTest);
		assertNotNull(discount);
	}
	
    @After // tearDown()
    public void after() throws Exception {
    	uTest = null;
        assertNull(uTest);
    }

}
