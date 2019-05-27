package sandez.com.intive.dao;

import java.util.LinkedList;
import java.util.Queue;

import sandez.com.intive.model.User;

public class DummyRentDao implements QueueDao<User> {

	private Queue<User> queueRent;

	public DummyRentDao() {
		this.queueRent = new LinkedList<User>();
	}

	@Override
	public boolean enqueue(User t) {
		return queueRent.offer(t);
	}

	@Override
	public User dequeue() {
		return queueRent.poll();
	}

	@Override
	public User top() {
		return queueRent.peek();
	}

}
