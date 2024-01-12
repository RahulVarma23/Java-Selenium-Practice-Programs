package interview.problems;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		System.out.println(lengthOfMaxSubstringWithoutRepeatingCharacters("abcabcbb"));
	}

	public static int lengthOfMaxSubstringWithoutRepeatingCharacters(String input) {
		int maxLength = 0;
		int right =0;
		int left = 0;
		
		HashSet<Character> set = new HashSet();
		
		while(right<input.length()){
			char rightChar = input.charAt(right);
			
			if(!set.contains(rightChar)) {
				set.add(rightChar);
				right++;
				maxLength = Math.max(maxLength, set.size());			
			}else {
				set.remove(input.charAt(left));
				left++;
			}		
		}	
		return maxLength;	
	}
}
