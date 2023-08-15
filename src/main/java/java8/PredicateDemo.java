package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PredicateDemo {

	public static void main(String[] args) {	
		List<Integer> list = Arrays.asList(1,2,4,5,5,6,8);
		
	    list.stream().filter(x-> x%2==0).collect(Collectors.toList())
				.forEach(System.out::println);
		
		List<String> list1 = Arrays.asList("Rahul","Rohit","Ankita");
		String filteredList = list1.stream().filter(x->x.startsWith("R")).findFirst().get();
		System.out.println(filteredList.toString());
	}
}
