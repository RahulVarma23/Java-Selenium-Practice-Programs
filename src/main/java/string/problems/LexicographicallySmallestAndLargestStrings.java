package string.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LexicographicallySmallestAndLargestStrings {

	public static void main(String[] args) {
		System.out.println(getSmallestAndLargest("welcometojava",3));
	}

	public static String getSmallestAndLargest(String s, int k) {

		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'

		List<String> l =  generateSubStringsOfLengthK(s,k);

		Collections.sort(l);
		System.out.println(l);

		String smallest = l.get(0);
		String largest = l.get(l.size()-1);

		return smallest + "\n" + largest;
	}

	public static List<String> generateSubStringsOfLengthK(String s, int k) {
		List<String > list = new ArrayList<>();
		for(int i=0;i<=s.length()-k;i++) {
			list.add(s.substring(i,i+k));
		}
		return list;
	}
}
