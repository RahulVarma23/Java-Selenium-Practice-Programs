package array.problems;

import java.util.*;


public class RemoveMaxAndMinFromArray {

	public static void main(String[] args) {
		int [] arr = {1,3,5,6,7,8,9,10};

		int min = Arrays.stream(arr).min().getAsInt();
		int max = Arrays.stream(arr).max().getAsInt();

		int [] ans = Arrays.stream(arr).filter(num-> num!=min && num !=max).toArray();

		System.out.println(Arrays.toString(ans));

		int sum = Arrays.stream(arr).sum();
		double avg = sum/arr.length;
		System.out.println(avg);
	}
}
