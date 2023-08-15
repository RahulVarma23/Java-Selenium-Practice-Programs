package java8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class forEachDemo {

	public static void main(String[] args) {
		Map <Integer, String > map = new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");	
		map.put(3, "c");
		map.put(4, "d");
		map.entrySet().stream().forEach(System.out::println);
		map.forEach((key,value)->System.out.println(key+"-->"+value));
		
	    Stream.iterate(1, n->(n+1)).limit(15).filter(n->(n%3==0)).collect(Collectors.toList()).forEach(System.out::println);
	}
}
