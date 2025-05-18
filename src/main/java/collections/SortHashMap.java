package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SortHashMap {

	public static void main(String[] args) {	
		HashMap <Integer , String >  hm = new HashMap <Integer , String >();
		hm.put(23, "Yash");  
		hm.put(17, "Arun");  
		hm.put(15, "Swarit");  
		hm.put(9, "Neelesh");  
		
		System.out.println("---Before sorting---");
		
		for (Map.Entry <Integer,String >entrySet : hm.entrySet()) {
			System.out.println(entrySet.getKey()+"-->"+entrySet.getValue());
		}
		
		System.out.println();
		System.out.println("---sorting based on value---");

		hm.entrySet().stream().sorted(Entry.comparingByValue()).forEach(System.out::println);

		System.out.println("---sorting based on key---");
		hm.entrySet().stream().sorted(Entry.comparingByKey()).forEach(System.out::println);
	}
}
