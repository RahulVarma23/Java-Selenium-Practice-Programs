package interview2.questions;

public class NumberOfPolindromes {

	public static void main(String[] args) {
		 String str = "naman";
		 System.out.println(findCountOfPolindrome(str));
	}
	
	public static int findCountOfPolindrome(String s) {
		int count =0;		
		for(int i =0;i<s.length();i++) {
			int j = i+1;
			while(j<=s.length()) {
				if(isPolindrome(s.substring(i,j))){
					count++;
					j++;
				}else {
					j++;
				}
			}		
		}	
		return count;
	}
	
	public static boolean isPolindrome(String s) {
		int start =0;
		int end = s.length()-1;
		while(start<end) {
			if(s.charAt(start++) != s.charAt(end--))
				return false;
		}	
		return true;
	}
}
