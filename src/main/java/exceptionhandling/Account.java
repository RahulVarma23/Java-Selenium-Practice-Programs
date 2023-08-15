package exceptionhandling;

public class Account {

	private static int balance = 100 ;
	
	public int balance() {
		return balance;
	}
	
	public static void withdraw(int amount ) throws SufficientFundsNotAvailableException {		
		if(amount>balance || (balance ==0)) {
			throw new SufficientFundsNotAvailableException("balance is insufficient");
		}else {
			balance -= amount;
		}		
	}
	   
    public static void main(String[] args) {
    	System.out.println("Current balance: "+balance);
    	withdraw(10);
    	System.out.println("Current balance: "+balance);
    	withdraw(1000);
	}
}
