package array.problems;

import java.util.Arrays;

public class ShiftZeroToLeft {

	public static void main(String[] args) {		
		int [] a={2,3,0,0,5,0,8};		
		int [] b = new int [a.length];
		
		int count=a.length-1;
		
		for(int i=a.length-1;i>=0;i--) {
			if(a[i] != 0) {
				b[count--]=a[i];
			}
		}
		System.out.println(Arrays.toString(b));
	}
}
