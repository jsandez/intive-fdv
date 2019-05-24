package sandez.com.intive.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import sandez.com.intive.discounts.Discount;
import sandez.com.intive.discounts.DiscountFactory;
import sandez.com.intive.model.Rent;
import sandez.com.intive.model.User;
import sandez.com.intive.service.RentService;

public class RentServiceImpl implements RentService {

	private DiscountFactory discountFactory;

	@Override
	public double chargeUser(User user, LocalDateTime endDate) {
		List<Rent> rents = user.getRents();
		double price = 0;
		for (Rent rent : rents) {
			price = price + rent.getRentType().charge(endDate);
		}
		Discount discount = discountFactory.getDiscount(user);
		if (discount != null) {
			price = discount.applyDiscount(price);
		}
		return price;
	}

}
