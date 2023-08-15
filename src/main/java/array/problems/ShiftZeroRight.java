package array.problems;
import java.util.Arrays;

public class ShiftZeroRight {

	public static void main(String[] args) {
		int [] a={2,3,0,0,5,0,8};		
		int [] b = new int [a.length];
		
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i] != 0) {
				b[count++]=a[i];
			}
		}
		System.out.println(Arrays.toString(b));
	}
}
