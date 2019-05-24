package sandez.com.intive.rents;

import java.time.LocalDateTime;

public abstract class RentType {

	private LocalDateTime startDate;

	public RentType(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public abstract double charge(LocalDateTime endDate);
}
