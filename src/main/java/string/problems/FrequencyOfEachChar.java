package string.problems;

import java.util.HashMap;

public class FrequencyOfEachChar {

	public static void main(String[] args) {
		findFrequency("occassional");
	}

	private static void findFrequency(String str) {
		HashMap<Character,Integer> hm = new HashMap<Character,Integer> ();	
		char ch [] = str.toCharArray();	
		for(char c : ch) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}else {
				hm.put(c, 1);
			}
		}	
		System.out.println(hm);
	}
}
