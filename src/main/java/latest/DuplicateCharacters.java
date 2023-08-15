package latest;

import java.util.HashSet;

//output:tec

public class DuplicateCharacters {

	public static void main(String[] args) {
		String s = "technocredits";	
		System.out.println(findDuplicate(s));
	}

	private static String findDuplicate(String str) {
		if (str == null || str.isEmpty()) {
			return null;
		}
		char[] ch = str.toCharArray();
		HashSet<Character> hs = new HashSet<Character>();
		String output = "";
		for (char c : ch) {
			if (hs.add(c) == false) {
				output = c+output;
			}
		}
		return output;
	}
	
	private static String findDuplicate1(String str) {
		String output="";
		
		
		return output;
	}
}
