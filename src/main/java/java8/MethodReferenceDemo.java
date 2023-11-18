package java8;

import java.util.List;
import java.util.stream.Collectors;

public class MethodReferenceDemo {
	
	public static void main(String[] args) {
		 
		 List<String> names = List.of("Alice", "Bob", "Charlie");
		 
		 
		 //get uppercase name list using lambda expression
		 List<String> listUsingLambda = names.stream().map(String::toLowerCase).collect(Collectors.toList());
		 
		 //get uppercase name list using method reference
		 List<String> listUsingMethodRef = names.stream().map(String::toUpperCase).collect(Collectors.toList());
		 
		 System.out.println(listUsingLambda);
		 System.out.println(listUsingMethodRef);
	}

}
