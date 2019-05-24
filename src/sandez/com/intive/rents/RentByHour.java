package sandez.com.intive.rents;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class RentByHour extends RentType{
	
	private static final int CHARGE = 5;

	public RentByHour(LocalDateTime startDate) {
		super(startDate);
	}

	@Override
	public double charge(LocalDateTime endDate) {
		long hours = ChronoUnit.HOURS.between(this.startDate, endDate);
		return hours * CHARGE;
	}

}
