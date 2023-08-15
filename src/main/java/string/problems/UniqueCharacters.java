package string.problems;

public class UniqueCharacters {
	
	
	public static void main(String[] args) {
		String str = "hello";	
		//output : helo
		
		char ch []  =str.toCharArray();
		String output = "";
		
		for (char character : ch) {		
			if(output.indexOf(character)<0) {
				output+=character;
			}		
		}	
		System.out.println(output);
	}	
}
