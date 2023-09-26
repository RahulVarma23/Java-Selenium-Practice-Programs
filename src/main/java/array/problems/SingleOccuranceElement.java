package array.problems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class SingleOccuranceElement {

//  WAP to print a single occurrence element from the array in Java?
//	i/p  : {5,8,1,2,4,3,2,1}
//	o/p : {5,8,4,3}

	public static void main(String[] args) {
		int [] array = {9,1,2,3,3,4,5,6,6,7};
		findSingleOccuranceElements(array);
	}

	private static void findSingleOccuranceElements(int[] array) {
		HashMap<Integer,Integer> hm = new LinkedHashMap<Integer,Integer>();

		for (int j : array) {
			hm.put(j, hm.getOrDefault(j, 0) + 1);
		}			
		Set<Integer> keys = hm.keySet();		
		for(Integer key: keys) {
			if(hm.get(key)==1){
				System.out.print(key+" ");
			}
		}
	}
}
