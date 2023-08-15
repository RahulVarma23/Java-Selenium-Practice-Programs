package interview.problems;
public class RemoveOccuranceUsingRecursion {
	public static void main(String[] args) {
		System.out.println(removeOccurances("AWAWSSGT","AWS"));
	}

	private static String removeOccurances(String s1, String s2) {
		char [] charArray = s2.toCharArray();	
		for(char ch :charArray) {			
			if(s1.indexOf(ch) !=-1) {
				s1=s1.replaceFirst(String.valueOf(ch), "");
			}
		}		
		if(s1.isEmpty()) {
			return "-1";
		}		
		if(s1.length()>=s2.length()) {
			return removeOccurances(s1,s2);
		}
		
		return s1;
	}
	
	
	
	

}
