package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Test {

	public static void main(String[] args) {	
		String s = "aabbbcccc";
		
		//o/p: a2b3c4 , 2a3b4c
		
		Map<Character,Integer> hm = new HashMap<Character,Integer>();
	
		
		for(char c: s.toCharArray()) {	
			hm.put(c,hm.getOrDefault(c, 0)+1);	
		}
		
		Set<Character> set = hm.keySet();
		
		for(char c : set) {
			System.out.print(hm.get(c)+""+c);
		}
	}
}
