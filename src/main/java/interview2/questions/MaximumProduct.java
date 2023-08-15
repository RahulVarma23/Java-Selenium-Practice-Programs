package interview2.questions;

import java.util.Arrays;

public class MaximumProduct {
	
	public static int findMaxProduct(int nums []){
		int len = nums.length;
		
		Arrays.sort(nums);
		
		System.out.println(Arrays.toString(nums));
		
		int product1 = nums[len-1]*nums[len-2]*nums[len-3];
		//int product2 = nums[0]*nums[1]*nums[len-1];
		
//		if(product1>product2)
//			return product1;	
		return product1;
	}
	
	public static void main(String[] args) {
		int [] arr = {-10,-1,-2,-4};
		System.out.println(findMaxProduct(arr));
	}
}
