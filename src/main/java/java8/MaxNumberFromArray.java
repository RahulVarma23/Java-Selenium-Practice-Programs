package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class MaxNumberFromArray {

	public static void main(String[] args) {	
		int [] arr = {3,6,12,1,6,87,9};
		
		int max = Arrays.stream(arr).max().getAsInt();
		int min = Arrays.stream(arr).min().getAsInt();
		
		System.out.println("max->"+max+","+"min->"+min);
		
		  List<Integer> list = Arrays.asList(20, 10, 100, 140, 250);  
		   
		  int min1 = Collections.min(list);
		  
		  System.out.println(min1);
	}
}
