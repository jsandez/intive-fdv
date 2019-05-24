package sandez.com.intive.rents;

import java.time.LocalDateTime;

public class RentByHour extends RentType{

	public RentByHour(LocalDateTime startDate) {
		super(startDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double charge(LocalDateTime endDate) {
		// TODO Auto-generated method stub
		return 0;
	}

}
