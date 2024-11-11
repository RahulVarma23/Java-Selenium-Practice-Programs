package interview2.questions;

public class AppendCountWithChars {

	public static void main(String[] args) {
		String s = "aaabbcccca";
		System.out.println(findOutput(s));
	}
	
	public static String findOutput(String s) {
		StringBuilder sb = new StringBuilder();
		char prevChar = 0;
		int count =0 ;
		for(char c : s.toCharArray()) {
			if(prevChar == c) {
				count++;
			}
			else {
				if (prevChar != 0) {
					sb.append(count).append(prevChar);
				}
				prevChar = c;
				count = 1;
			}
		}
		sb.append(count).append(prevChar);	
		return sb.toString();
	}
	
	public static String findOutput1() {
		StringBuffer sb = new StringBuffer();
		char prevChar = 0;
		int count =0;	
		return "";
	}
}
