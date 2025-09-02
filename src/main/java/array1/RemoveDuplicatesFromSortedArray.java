package array1;

import java.sql.SQLOutput;
import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {
	static int removeDuplicates(int [] array) {		
		int j=0;
		for(int i=0;i<array.length-1;i++) {		
			if(array[i] !=array[i+1]) {
				j++;
				array[j]=array[i+1];
			}			
		}
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
		int [] arr = {1, 1, 2, 2, 3, 4, 5, 5};
		int newLength = removeDuplicates(arr);
		for(int i=0;i<=newLength;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
