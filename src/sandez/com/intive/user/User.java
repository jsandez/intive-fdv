package sandez.com.intive.user;

import java.time.LocalDateTime;
import java.util.List;

import sandez.com.intive.discounts.Discount;
import sandez.com.intive.discounts.DiscountFactory;
import sandez.com.intive.rents.RentType;

public class User {

	private List<RentType> rents;
	private double price;
	private DiscountFactory discountFactory;

	public List<RentType> getRents() {
		return rents;
	}

	public void setRent(RentType rent) {
		rents.add(rent);
	}

	public double charge() {
		price = 0;
		for (RentType rent : rents) {
			price = price + rent.charge(LocalDateTime.now());
		}
		Discount discount = discountFactory.getDiscount(this);
		discount.applyDiscount(this);
		return price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
