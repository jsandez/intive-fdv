package sandez.com.intive.discounts;

public class FamilyRental implements Discount {
	@Override
	public double applyDiscount(double price) {
		double discount = price * 0.3;
		return (price - discount);
	}

}
