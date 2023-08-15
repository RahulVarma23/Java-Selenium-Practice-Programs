package array.problems;

public class MaxProductSubArray {

	public static void main(String[] args) {
		int [] arr = {2,3,-2,4,3,1};
		
		int maxProduct = Integer.MIN_VALUE;
		int currentProduct = 1;
		
		for(int i=0;i<arr.length;i++) {
			currentProduct*=arr[i];
			maxProduct=Math.max(maxProduct, currentProduct);
			if(currentProduct==0)
				currentProduct=1;
		}
		
		currentProduct = 1;
		for(int i=arr.length-1;i>=0;i--) {
			currentProduct*=arr[i];
			maxProduct=Math.max(maxProduct, currentProduct);
			if(currentProduct==0)
				currentProduct=1;
		}	
		System.out.println(maxProduct);
	}
}
