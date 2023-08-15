package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindSquareAndFilter {

	public static void main(String[] args) {
		Integer [] arr = {3,6,12,1,6,87,9};
	
		List<Integer> list = Arrays.asList(arr);
		
		List<Integer>filteredList = list.stream().map(x->x*x).filter(y->y>100).collect(Collectors.toList());
		
		Double avg = list.stream().map(x->x*x).filter(y->y>100).mapToInt(z->z.intValue()).average().getAsDouble();
		
	    System.out.println(filteredList);
	    System.out.println(avg);	
	}
}
