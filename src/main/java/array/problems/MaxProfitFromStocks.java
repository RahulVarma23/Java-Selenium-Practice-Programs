package array.problems;

public class MaxProfitFromStocks {
	
	public static int maxProfit(int input []) {	
		int maxProfit=0;	
		int min=input[0];
		
		for (int i=0;i<input.length;i++) {
			min = Math.min(min ,input[i]);		
			maxProfit=Math.max(maxProfit, input[i]-min);		
		}		
		return maxProfit;
	}

	public static void main(String[] args) {
		
		int [] prices = {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));		
	}
}
