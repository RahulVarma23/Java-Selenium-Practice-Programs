package interview2.questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringUnion {

	public static void main(String[] args) {
		 String s1 = "Isabella tom hardy";
		 String s2 = "Isabella tom hardy victor smith";
		
		String [] arr1 = s1.split(" ");
		String [] arr2 = s2.split(" ");
		
		Set<String> set = new HashSet<String>();
	
		set.addAll(Arrays.asList(arr1));
		set.addAll(Arrays.asList(arr2));
		
		set.stream().forEach(System.out::println);
	}
}
