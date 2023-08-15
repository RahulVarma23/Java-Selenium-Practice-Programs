package string.problems;

public class PrintMiddleCharacter {
	public static void main(String[] args) {
		String s = "Javascript";
		int length;
		int mid;
		
		if(s.length()%2==0) {
			mid = s.length() / 2-1;
			length =2;
		}else {
			mid = s.length() / 2;
			length=1;
		}
		System.out.println(s.substring(mid,mid+length));	
	}
}
