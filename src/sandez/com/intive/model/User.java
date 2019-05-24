package sandez.com.intive.model;

import java.util.ArrayList;
import java.util.List;

public class User {

	private String userId;
	private List<Rent> rents;

	public String getUserId() {
		return userId;
	}

	public List<Rent> getRents() {
		return rents;
	}

	public void setRents(List<Rent> rents) {
		this.rents = rents;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
