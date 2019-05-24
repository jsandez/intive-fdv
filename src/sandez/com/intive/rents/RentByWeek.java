package sandez.com.intive.rents;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class RentByWeek extends RentType {

	private static final int CHARGE = 60;

	public RentByWeek(LocalDateTime startDate) {
		super(startDate);
	}

	@Override
	public double charge(LocalDateTime endDate) {
		long hours = ChronoUnit.WEEKS.between(this.startDate, endDate);
		return hours * CHARGE;
	}

}
