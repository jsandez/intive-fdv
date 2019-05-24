package sandez.com.intive.discounts;

import sandez.com.intive.model.User;

public class DiscountFactory {

	public Discount getDiscount(User user) {
		long rentSize = user.getRents().size();
		if (rentSize >= 3 && rentSize <= 5) {
			return new FamilyRental();
		}
		return null;
	}
}
