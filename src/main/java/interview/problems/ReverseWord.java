package interview.problems;

public class ReverseWord {
	
	public static String reverse (String str) {
		String reverse = "";		
		for(int i=str.length()-1;i>=0;i--) {
			reverse +=str.charAt(i);
		}	
		return reverse;	
	}
	
	public static String findReverseOfWords(String s) {
		if (s==null || s.isEmpty())
			return null;
		
		String word ="";
		String ans="";
		
		int l=0;
		int r = s.length()-1;
		
		while(Character.isAlphabetic(s.charAt(l))) {
			ans += word;
			l++;		
		}		
		return ans;		
	}
	
	public static void main(String[] args) {	
		String input = "java12script34pyt";

		System.out.println(findReverseOfWords(input));
	}
}
