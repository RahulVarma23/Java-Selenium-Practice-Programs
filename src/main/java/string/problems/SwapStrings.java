package string.problems;

public class SwapStrings {

	public static void main(String[] args) {
		
		String s1 = "rahul34";
		String s2 = "varma12";
		
		s1 = s1.concat(s2);
		
		//rahulvarma
		
		s2 = s1.substring(0, s2.length());
		s1 = s1.substring(s2.length());
		
		System.out.println(s1 + " "+s2);

	}

}
