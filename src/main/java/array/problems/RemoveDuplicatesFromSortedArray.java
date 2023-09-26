package array.problems;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {
	static int removeDuplicates(int [] array) {		
		int j=1;
		for(int i=0;i<array.length-1;i++) {		
			if(array[i] !=array[i+1]) {			
				array[j]=array[i+1];
				j++;	
			}			
		}
		System.out.println(Arrays.toString(array));
		return j;
	}
	
	static int removeDuplicates1(int [] array) {		
		HashSet<Integer> hs = new HashSet<Integer>();	
		for(int num : array) {
			hs.add(num);
		}	
		System.out.println(hs);
		return hs.size();
	}
		
	public static void main(String[] args) {
		int [] arr = { 1,1,2,2,2,3,3,4,4,4,4};
		System.out.println(removeDuplicates(arr));
	}
}
