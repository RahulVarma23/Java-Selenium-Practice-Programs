package interview2.questions;

public class NumberOfChararacterInString {

	public static void main(String[] args) {
		String s = "Rahul  Varma";		
		System.out.println(countChars1(s));		
	}
	
	public static int countChars1(String s) {
		return s.replaceAll("\\s+", "").length();
	}
	
	public static int countChars2(String s) {
		int count = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) != ' ') 
				count++;			
		}	
		return count;
	}
}
