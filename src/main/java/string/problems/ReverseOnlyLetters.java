package string.problems;

public class ReverseOnlyLetters {
	
	public static String reverseLetters(String input) {	
		char [] charArray= input.toCharArray();
		int l =0;int r = input.length()-1;
		while(l<r) {		
			while(!Character.isAlphabetic(charArray[l])) {
				l++;
			}	
			while(!Character.isAlphabetic(charArray[r])) {
				r--;
			}		
			swap(charArray,l,r);
			l++;
			r--;	
		}	
		return new String (charArray);	
	}
	
	private static void swap(char [] ch , int i , int j) {
		char temp =ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
	}
	
	public static void main(String[] args) {
	System.out.println(reverseLetters("A1B2C3"));	
	}
}
