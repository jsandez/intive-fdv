package sandez.com.intive.discounts;

import sandez.com.intive.user.User;

public class FamilyRental implements Discount {
	@Override
	public void applyDiscount(User user) {
		double price = user.getPrice();
		double discount = price * 0.3;
		user.setPrice(price - discount);
	}

}
