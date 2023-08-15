package interview.problems;

public class PromotingLetters {
	 void  replaceCharacter(String str) {
		String ans="";
		for (int i=0;i<str.length();i++) {
			int s= (str.charAt(i))+1;
			if(s==123) s=97;
			if(s==91) s=65;
			if(s==58) s=48;
			ans+=(char)s;			
		}
		System.out.println(ans);		
	}
	 
	public static void main(String[] args) {
		String str = "aB7pQ9";
		PromotingLetters d= new PromotingLetters();
		d.replaceCharacter(str);	
	}
}
  