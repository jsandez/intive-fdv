package sandez.com.intive.rents;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class RentByDay extends RentType{

	private static final int CHARGE = 20;

	public RentByDay(LocalDateTime startDate) {
		super(startDate);
	}

	@Override
	public double charge(LocalDateTime endDate) {
		long hours = ChronoUnit.DAYS.between(this.startDate, endDate);
		return hours * CHARGE;
	}

}
