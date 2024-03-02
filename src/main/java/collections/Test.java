package collections;

import java.util.*;


public class Test {

	public static boolean isPolindrome(String str) {
		String s = str.toLowerCase().replaceAll("[^a-z]","");
		System.out.println(s);
		int start =0;
		int end = s.length()-1;
		while(start<end) {
			if(s.charAt(start++) != s.charAt(end--))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		String s = "A man, a plan, a canal: Panama.";
		System.out.println(isPolindrome(s));

	}
}
