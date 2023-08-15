package interview2.questions;

import java.util.Map;
import java.util.TreeMap;

public class MergeTwoArrays {
	
	static void mergeTwoArrays(int [] arr1 , int [] arr2) {
		Map<Integer,Boolean> map = new TreeMap<Integer,Boolean>();
		
		for(int i=0;i<arr1.length;i++) {
			map.put(arr1[i],true);
		}
		for(int i=0;i<arr2.length;i++) {
			map.put(arr2[i],true);
		}
		
		for(Map.Entry<Integer,Boolean> hm : map.entrySet()) {
			System.out.print(hm.getKey()+" ");
		}
	}

	public static void main(String[] args) {
		int [] a = {1,4,6};
		int [] b = {2,6,7,8};
		mergeTwoArrays(a,b);
	}
}
