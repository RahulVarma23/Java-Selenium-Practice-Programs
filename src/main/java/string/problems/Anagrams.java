package string.problems;

import java.util.Arrays;

public class Anagrams {
	
	public static void main(String[] args) {
		System.out.println(areAnagrams("yat","tea"));
	}

	private static boolean areAnagrams(String str1, String str2) {
		if(str1 == null || str1.isEmpty()==true || str2==null || str2.isEmpty()==true) {
			return false;
		}
		
		char [] s1 = str1.toCharArray();
		char [] s2 = str2.toCharArray();
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		if(s1.length != s2.length) 
			return false;
		
		for(int i=0;i<s1.length;i++) 
			if(s1[i]!=s2[i]) 
              return false;
						
		return true;
	}
}
