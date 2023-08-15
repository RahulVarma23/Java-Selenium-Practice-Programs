package interview.problems;

public class EliminateDigits {
	
	public static void main(String[] args) {
		String st = "AbGt8pR4Y";
		String ans ="";
		for (int i=0;i<st.length();i++) {	
			if (st.charAt(i)>=65 && st.charAt(i)<=90 ||st.charAt(i)>=97 && st.charAt(i)<=122 ) {
				ans=ans+st.charAt(i);
			}
		}
		System.out.println(ans);	
	}
}