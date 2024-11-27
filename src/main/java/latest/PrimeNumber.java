package latest;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println(checkPrime(67));
	}

	private static boolean checkPrime(int num) {
		boolean flag= true;
		for(int i=2; i<=num/2;i++) {
			if ((num % i == 0)) {
				flag = false;
				break;
			}
		}
		return flag;
	}

}
