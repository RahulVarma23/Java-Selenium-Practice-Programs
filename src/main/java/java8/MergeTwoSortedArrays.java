package java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
        int arr1 [] = {1,2,5,8,9};
        int arr2 [] = {3,4,6};
        
        Map<Integer, Boolean> hm = new HashMap<>();
       
        
        Arrays.stream(arr1).forEach(n->hm.put(n, true));
        Arrays.stream(arr2).forEach(n->hm.put(n, true));
        
        hm.keySet().stream().forEach(System.out::println);
        
//        for(Map.Entry<Integer, Boolean> map : hm.entrySet()) {
//        	System.out.println(map.getKey());
//        }
	}
}
