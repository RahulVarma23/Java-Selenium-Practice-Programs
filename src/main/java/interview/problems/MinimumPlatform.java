package interview.problems;

import java.util.Arrays;

public class MinimumPlatform {
	
	
	static int findNumberOfPlatforms(int [] arr , int [] dep , int n) {
		
		Arrays.sort(arr);
		Arrays.sort(dep);
		int result = 1;int platforms =1;
		int i =1,j=0;
		
		while(i<n && j< n) {
			
			if(arr[i]<=dep[j]) {
				platforms++;
				i++;				
			}else if(arr[i]>dep[j]) {
				platforms--;
				j++;
			}			
				result = Math.max(platforms, result);
		}
			
		
		return result;
		
	}

	public static void main(String[] args) {
		

		int [] arr = {9 , 8 , 5,10,12,18};
		
		int [] dep = {9, 13,19, 11 ,13};
		
		System.out.println(findNumberOfPlatforms(arr,dep,6));
	}

}
