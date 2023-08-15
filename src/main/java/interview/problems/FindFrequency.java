package interview.problems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FindFrequency {

	public static void main(String[] args) {	
		String s ="aaabbbbppt";
		
		HashMap <Character , Integer> hm = new LinkedHashMap <Character , Integer>();
		
		for(char ch: s.toCharArray()) {	
			hm.put(ch, hm.getOrDefault(ch, 0)+1);			
		}
		
		for(Entry <Character,Integer> map : hm.entrySet()) {
			System.out.print(map.getKey()+""+map.getValue());
		}
	}
}
