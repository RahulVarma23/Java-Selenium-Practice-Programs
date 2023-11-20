package patternprinting;

public class OddNumberPattern {

	/* Question 20 : Write a java program to print a triangle with odd numbers where n is representing number of rows to be print.
Input:
            n = 7;
Output:
           1
           1 3
           1 3 5
           1 3 5 7
           1 3 5 7 9
           1 3 5 7 9 11
           1 3 5 7 9 11 13
 */

	public static void main(String[] args) {

		for(int i=1;i<=7;i++) {

			int num=1;
			for(int j=1;j<=i;j++) {
				System.out.print(num+" ");
				num+=2;
			}
			System.out.println();
		}
	}
}
