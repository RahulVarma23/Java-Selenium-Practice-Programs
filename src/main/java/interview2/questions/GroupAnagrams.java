package interview2.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

	public static void main(String[] args) {
		String s1[] = { "cars", "dues", "scar", "used", "paired", "ones", "grab", "brag", "ragb" };
        System.out.println(getAnagramGroups(s1));
	}

	public static List<List<String>> getAnagramGroups(String str []){		
		HashMap<String,List<String>> map = new HashMap();		
		for(String s : str) {
			char [] ch = s.toCharArray();
			Arrays.sort(ch);
			String key = String.valueOf(ch);
			if(!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
			
			map.get(key).add(s);			
		}	
		
		return new ArrayList<>(map.values());
	}
}
