package interview2.questions;

public class SumOfDigitsUntilSingleDigit {

	public static void main(String[] args) {
		System.out.println(findSum(5674));
	}
	
	public static int findSum(int num) {
		
		int sum =0 ;
		while(num>0) {
			int rem = num%10;
			sum +=rem;
			num /=10;
		}
		
		if(sum<10) {
			return sum;
		}else {
			return findSum(sum);
		}
	}

}