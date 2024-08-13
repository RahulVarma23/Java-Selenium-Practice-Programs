package string.problems;

public class SwapStrings {

	public static void main(String[] args) {
		
		String s1 = "rahul341";
		String s2 = "varma12";
		
		s1 = s1.concat(s2);
		
		//rahul341varma12
		
		s2 = s1.substring(0, (s1.length()-s2.length()));
		s1 = s1.substring(s2.length());
		
		System.out.println(s1 + " "+s2);
	}
}
