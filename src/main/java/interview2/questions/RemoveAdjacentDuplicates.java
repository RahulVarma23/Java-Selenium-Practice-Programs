package interview2.questions;

public class RemoveAdjacentDuplicates {
	
	public static String removeDuplicates(String s) {
		String result = "";
		if(s.length()<=1) {
			return s;
		}	
		
		if(s.charAt(0)!=s.charAt(1)) {
			result+=s.charAt(0);
		}
		
		for(int i=1; i<s.length()-1;i++) {
			if(s.charAt(i-1)!=s.charAt(i) && s.charAt(i)!=s.charAt(i+1)) {
				result+=s.charAt(i);
			}
		}	
		
		if(s.charAt(s.length()-1) != s.charAt(s.length()-2)) {
			result+=s.charAt(s.length()-1);
		}	
		return result;
	}
		
	public static void main(String[] args) {
		String s = "aabbbcabcbb";
		System.out.println(removeDuplicates(s));
	}
}
