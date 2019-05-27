package sandez.com.intive.service.impl;

import java.util.List;

import sandez.com.intive.dao.DummyRentDao;
import sandez.com.intive.dao.QueueDao;
import sandez.com.intive.discounts.Discount;
import sandez.com.intive.discounts.DiscountFactory;
import sandez.com.intive.exception.UserNotReadyToChargeException;
import sandez.com.intive.model.Rent;
import sandez.com.intive.model.User;
import sandez.com.intive.service.RentService;

public class RentServiceImpl implements RentService {

	private DiscountFactory discountFactory;
	private QueueDao<User> rentQueueDao;

	public RentServiceImpl() {
		this.rentQueueDao = new DummyRentDao();
	}

	@Override
	public double chargeUser(String userId) {
		double price = 0;
		String firstUser = rentQueueDao.top().getUserId();
		if (userId.equalsIgnoreCase(firstUser)) {
			User user = rentQueueDao.dequeue();
			List<Rent> rents = user.getRents();
			for (Rent rent : rents) {
				price = price + rent.getRentType().charge(rent);
			}
			discountFactory = new DiscountFactory();
			Discount discount = discountFactory.getDiscount(user);
			if (discount != null) {
				price = discount.applyDiscount(price);
			}
		} else {
			throw new UserNotReadyToChargeException("User not ready. First user = '" + firstUser + "'");
		}
		return price;
	}

	@Override
	public void addOrder(User user) {
		rentQueueDao.enqueue(user);
	}

}
