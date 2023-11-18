package array.problems;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {	
		int [] a = {1,2,3,4,5,6};
		rotate(a, 2);
	}
	
	public static void rotate(int arr [] , int k) {
		k= k%arr.length;	
		reverse(arr,0,arr.length-1);
		reverse(arr,0,k-1);
		reverse(arr,k,arr.length-1);	
		System.out.println(Arrays.toString(arr));	
	}
	
	public static void reverse(int [] nums , int start, int end) {
		while(start<end) {
		    int temp = nums[start];
		    nums[start] = nums[end];
		    nums[end] = temp;	
		    start++;
		    end--;
		}
	}
}
