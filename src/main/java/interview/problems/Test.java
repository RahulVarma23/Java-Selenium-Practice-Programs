package interview.problems;

public class Test {

	public static void main(String[] args) {	
		String s = "0123465";	
		System.out.println(checkZero(s));
	}

	private static boolean checkZero(String s) {
		for (int i = 1; i < s.length(); i++) {
			int k= Character.getNumericValue(s.charAt(i)) ;
			if ((k == 0)) {
				return true;
			}	
		}
		return false;
	}
}
