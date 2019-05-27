package sandez.com.intive.dao;

public interface QueueDao<T> {

	public boolean enqueue(T t);

	public T dequeue();

	public T top();

}
