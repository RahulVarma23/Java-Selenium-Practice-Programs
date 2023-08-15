package Demo;

public class StringProblem {
	
	public static void main(String[] args) {	
		String s = "naman1";
		System.out.println(isPalindrome(s));
	}
	
	static boolean isPalindrome(String s){	
		int start = 0;
		int end = s.length()-1;
		try {
		while(start<=end) {
			if(s.charAt(start++) != s.charAt(end--)) {
				return false;
			}
		}	
		}catch(Exception e) {
			
		}finally {
			return true;	
		}	
	}
}
