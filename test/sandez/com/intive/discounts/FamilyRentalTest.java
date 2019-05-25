package sandez.com.intive.discounts;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FamilyRentalTest {

	@Test
	public void applyDiscountTest() {
		Discount discount = new FamilyRental();
		double price = 100;
		double newPrice = discount.applyDiscount(price);
		assertTrue(newPrice == 70);
	}

}
