package string.problems;

public class Test1 {
	
	public static void main(String[] args) {
		String s = "EPAM";
		
//		for(int i=0;i<s.length();i++) {
//			System.out.println(s.substring(0,s.length()-i));
//		}
		
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(s.substring(0,s.length()-i));
		}
	}
}
