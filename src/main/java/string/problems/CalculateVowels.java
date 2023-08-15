package string.problems;

public class CalculateVowels {

	public static void main(String[] args) {
		System.out.println(CalculateVowels("rahulvarma"));;

	}

	private static int CalculateVowels(String string) {
		char [] ch = string.toLowerCase().toCharArray();
		int count =0;	
		for(char c : ch) {
			if((c == 'a') || (c == 'e')||(c == 'i')||(c == 'o')||(c == 'u'))  {	
				count++;
			}	
		}		
		return count;
	}

}
