package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesUsingStream {
	
	public static void main(String[] args) {
		List <Integer> list =  Arrays.asList(1,2,3,4,2,1,3);		
		List<Integer> withoutDupes =list.stream().distinct().collect(Collectors.toList());		
		System.out.println("List without duplicates: " + withoutDupes);	
	}
}
