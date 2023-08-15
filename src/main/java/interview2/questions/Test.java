package interview2.questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(rvereseArray(nums, 0, 6));
		testMethod("aabbbccccd");
	}

	static String rvereseArray(int arr[], int start, int end) {
		int temp;

		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

		return Arrays.toString(arr);
	}
	
	public static void testMethod(String s) {
		
		HashMap<Character,Integer> map = new HashMap<>();
		char [] arr = s.toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		
		System.out.println();
		
		Set<Character> keys = map.keySet();
		
		for(char key : keys) {
			
			System.out.print(key+""+map.get(key));
			
			
		}
		
		
	}
}
