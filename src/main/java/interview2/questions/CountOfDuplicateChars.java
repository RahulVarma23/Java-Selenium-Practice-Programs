package interview2.questions;

import java.util.HashMap;
import java.util.Set;

public class CountOfDuplicateChars {
	
	public static void findDuplicateChars(String s) {
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(char c : s.toCharArray()) {			
			map.put(c, map.getOrDefault(c, 0)+1);
		}	
		
		Set<Character> keySet = map.keySet();	
		
		boolean flag = false;
		for(char c : keySet) {
			if(map.get(c)>1) {
				flag = true;
				System.out.println("Character "+c+" is repeated "+map.get(c)+" times");
			}
		}
		
		if(flag==false) {
			System.out.println("none of characters are repeated");
		}
	}

	public static void main(String[] args) {
		String s = "aews";
		findDuplicateChars(s);
	}
}
