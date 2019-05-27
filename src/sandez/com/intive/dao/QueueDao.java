package sandez.com.intive.dao;

import java.util.Queue;

public interface QueueDao<T> {

	public boolean enqueue(T t);

	public T dequeue();

	public T top();

}
