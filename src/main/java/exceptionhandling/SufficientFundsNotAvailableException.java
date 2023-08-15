package exceptionhandling;

public class SufficientFundsNotAvailableException extends RuntimeException {
	
    String message;

	public SufficientFundsNotAvailableException(String message) {
		this.message =  message;
	}

	 public String getMessage() {
	        return message;
	 }
}
