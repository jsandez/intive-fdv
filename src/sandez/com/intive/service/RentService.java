package sandez.com.intive.service;

import sandez.com.intive.model.User;

public interface RentService {

	public double chargeUser(String userId);

	public void addOrder(User user);
}
