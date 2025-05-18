package string.problems;

public class LongestPolindrome {
	
//	Write a function to find out longest palindrome in a given string
//	i/p  : { "nitin", "jadeja", "mama", "madamimadam" };
//	o/p : madamimadam

	public static void main(String[] args) {
		String input [] = {"nitin", "jadeja", "mama", "madamimadam"};
		int maxLen=0;
	    String longestPoli = input[0];

		for(int i=0;i<input.length;i++) {	
			if(checkPolindrome(input[i]) && input[i].length()>maxLen) {
				maxLen= input[i].length();
				longestPoli = input[i];			
			}
		}		
		System.out.println(longestPoli);
		System.out.println(maxLen);
		
//		String s1 = "I love my India";
//		
//		String s2 = StringUtils.deleteWhitespace(s1);
//		
//		System.out.println(s2);
	}

	private static boolean checkPolindrome(String s) {
		int start = 0 ;
		int end = s.length()-1;

		while(start<end) {
			if(s.charAt(start++) !=s.charAt(end--)) {
				return false;
			}
		}
		return true;
	}
}
