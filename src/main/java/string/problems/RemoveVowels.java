package string.problems;

public class RemoveVowels {
	
	public static String removeVowels(String s) {	
		char [] ch = s.toCharArray();
		String output ="";
		for(int i=0;i<s.length();i++) {
			if(!isVowel(ch[i])) {
				output+=ch[i];
			}
		}	
		return output ;
	}
	
	public static boolean isVowel(char letter) {
		char ch = Character.toLowerCase(letter);
		return ch =='a' || ch =='e' || ch=='i' || ch =='o' || ch =='u';	
	}
	

	public static void main(String[] args) {
		System.out.println(removeVowels("rahulvarma"));;
	}
}
