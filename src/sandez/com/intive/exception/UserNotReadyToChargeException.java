package sandez.com.intive.exception;

public class UserNotReadyToChargeException extends RuntimeException {

	private static final long serialVersionUID = 7703788508454512307L;

	public UserNotReadyToChargeException(String message) {
		super(message);
	}

}
