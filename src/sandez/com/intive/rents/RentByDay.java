package sandez.com.intive.rents;

import java.time.LocalDateTime;

public class RentByDay extends RentType{

	public RentByDay(LocalDateTime startDate) {
		super(startDate);
	}

	@Override
	public double charge(LocalDateTime endDate) {
		// TODO Auto-generated method stub
		return 0;
	}

}
