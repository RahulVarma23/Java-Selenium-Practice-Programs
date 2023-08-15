package interview2.questions;

import java.util.Arrays;

public class ReverseArrayInSubset {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8};
		System.out.println(reverse(arr,4));
	}
	
	public static String reverse(int [] arr, int k) {
		for(int i=0;i<arr.length;i=i+k) {
			int start  = i;
			int end = Math.min(i+k-1, arr.length-1);
			
			while(start<end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end]=temp;
				start++;
				end--;
			}			
		}	
		return Arrays.toString(arr);
	}
}
