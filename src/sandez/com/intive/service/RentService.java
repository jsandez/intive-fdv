package sandez.com.intive.service;

import java.time.LocalDateTime;

import sandez.com.intive.model.User;

public interface RentService {

	public double chargeUser(User user, LocalDateTime endDate);
}
