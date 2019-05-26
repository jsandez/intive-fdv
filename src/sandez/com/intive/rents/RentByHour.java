package sandez.com.intive.rents;

import java.time.temporal.ChronoUnit;

import sandez.com.intive.model.Rent;

public class RentByHour extends RentType {

	private static final int CHARGE = 5;

	@Override
	public double charge(Rent rent) {
		long hours = ChronoUnit.HOURS.between(rent.getStartDate(), rent.getEndDate());
		return hours * CHARGE;
	}

}
