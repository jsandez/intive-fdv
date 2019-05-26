package sandez.com.intive.rents;

import java.time.temporal.ChronoUnit;

import sandez.com.intive.model.Rent;

public class RentByWeek extends RentType {

	private static final int CHARGE = 60;

	@Override
	public double charge(Rent rent) {
		long hours = ChronoUnit.WEEKS.between(rent.getStartDate(), rent.getEndDate());
		return hours * CHARGE;
	}

}
