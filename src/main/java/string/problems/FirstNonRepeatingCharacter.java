package string.problems;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {		
		String str = "hello";	
		
		char ch []  =str.toCharArray();
		
		for (char character : ch) {		
			if(str.indexOf(character)==str.lastIndexOf(character)) {
				System.out.print(character);
				break;
			}
		}
	}
}
