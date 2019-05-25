package sandez.com.intive.discounts;

public class FamilyRental implements Discount {
	
	public static final long discount = 30;
	@Override
	public double applyDiscount(double price) {
		double discountMultiplier = discount / 100.0;
		double discount = price * discountMultiplier;
		return (price - discount);
	}

}
