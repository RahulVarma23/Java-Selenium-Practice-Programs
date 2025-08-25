package interview2.questions;

import org.apache.commons.lang3.StringUtils;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		System.out.println(findLongestPolindromicSubString("babad"));
	}
	
	static String findLongestPalindrome(String s) {
		int maxLen = 0;
		String longestSubString = StringUtils.EMPTY;
		
		if(s==null || s.length()<=1) 
			return s;
					
		for(int i=0;i<s.length();i++) {			
			for(int j = i+1; j<=s.length();j++) {				
				String substring=s.substring(i,j);				
				if(isPalindrome(substring) && substring.length()>maxLen) {
					longestSubString = substring;
					maxLen = Math.max(maxLen, substring.length());					
				}
			}			
		}		
		return longestSubString;
	}
	
	static String findLongestPalindrome1(String s) {
		int maxLen = 0;
		String longestSubString = "0";

		if (s == null || s.length() <= 1)
			return s;	

		for (int i = 0; i < s.length(); i++) {
			int j = i+1;
			while (j <= s.length()) {
				String substring = s.substring(i, j);
				if (isPalindrome(substring) && substring.length() > maxLen) {
					longestSubString = substring;
					maxLen = Math.max(maxLen, substring.length());
				}
				j++;
			}
		}
		return longestSubString;
	}
	
	static boolean isPalindrome(String str) {
		int start = 0;
		int end = str.length()-1;
		
		while(start<end) {	
			if(str.charAt(start++) != str.charAt(end--)) {
				return false;
			}
		}
		return true;
	}

    private static int findLongestPolindromicSubString(String s) {
        if(s.length()<=1){
            return s.length();
        }

        String maxString = s.substring(0,1);

        for(int i=0;i<s.length();i++) {
            String odd = expandByCenter(s, i, i);
            String even = expandByCenter(s, i , i+1);

            if(odd.length()>maxString.length()) {
                maxString = odd;
            }

            if(even.length()>maxString.length()) {
                maxString = even;
            }
        }

        return maxString.length();
    }

    private static String expandByCenter(String s, int left, int right) {

        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return s.substring(left+1, right);
    }
}
