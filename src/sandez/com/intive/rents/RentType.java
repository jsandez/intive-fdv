package sandez.com.intive.rents;

import sandez.com.intive.model.Rent;

public abstract class RentType {

	public abstract double charge(Rent rent);
}
