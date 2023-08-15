package string.problems;

import org.apache.commons.lang3.StringUtils;

public class SumOfIntegersInString {

	public static void main(String[] args) {
		

		String str = "te12chno34cre5dits6";
	
		int sum=0;
		for(int i=0;i<str.length();i++) {
			String s1="0";
			while(i<str.length() && str.charAt(i)>=48 && str.charAt(i)<=57) {
				s1+=str.charAt(i);
				i++;
			}	
			sum+=Integer.parseInt(s1);
		}	
		System.out.println(sum);	
	}
}
