package string.problems;

import java.util.HashMap;
import java.util.Set;

public class SecondMostFrequestCharacter {
	 
	public static void main(String[] args) {
		System.out.println(findSecondMax("banana"));
	}
	
	public static char findSecondMax(String s) {
		int max = 0 ; int secondMax = 0;
		char maxRepeated = Character.MAX_VALUE, secondMaxRepeated = Character.MIN_VALUE;
		
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
	
		for(char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		Set<Character> keyset = map.keySet();
		
		for(char c : keyset) {			
			if(map.get(c)>max) {
				max = map.get(c);
				maxRepeated = c;
			}else if(map.get(c)>secondMax && map.get(c)<max) {
				secondMax = map.get(c);
				secondMaxRepeated = c;
			}	
		}
		return secondMaxRepeated;	
	}
}
