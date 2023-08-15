package interview2.questions;

public class MaxWaterStorage {
	
	public static int findMaxArea(int [] height) {
		int left = 0;
		int right = height.length-1;
		int maxArea =0;
		
		int maxLeft = height[left];
		int maxRight = height[right];
		
		if(height.length<=2) {
			return 0;
		}
				
		while(left<right) {
			if(maxLeft<maxRight) {
				maxLeft=Math.max(maxLeft, height[left]);
				maxArea+=maxLeft-height[left];
				left++;
			}else {
				maxRight=Math.max(maxRight, height[right]);
				maxArea+=maxRight-height[right];
				right--;
			}		
		}	
		return maxArea;
	}
	
	public static void main(String[] args) {
		int [] bars = {4,2,0,3,2,5};
		System.out.println(findMaxArea(bars));
	}

}
