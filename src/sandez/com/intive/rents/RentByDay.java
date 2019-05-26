package sandez.com.intive.rents;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import sandez.com.intive.model.Rent;

public class RentByDay extends RentType{

	private static final int CHARGE = 20;

	@Override
	public double charge(Rent rent) {
		long hours = ChronoUnit.DAYS.between(rent.getStartDate(),rent.getEndDate());
		return hours * CHARGE;
	}

}
