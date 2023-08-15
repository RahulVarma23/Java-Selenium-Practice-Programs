package interview.problems;

public class Factors {

	public static void main(String[] args) {
		int num = 10;
		
		for (int i=1;i<=num/2;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
	}
}
