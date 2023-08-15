package interview2.questions;

public class NearestPolindrome {

	public static void main(String[] args) {
       System.out.println(findNearestPolindrome(1005));
	}
	
	public static int findNearestPolindrome(int input) {
		int temp1 = input+1;
		int temp2 = input-1;
		
		if(isPolindrome(input)) {
			return input;
		}
		
		while(!isPolindrome(temp1) || !isPolindrome(temp2)) {
		if(isPolindrome(temp1)) {
			return temp1;
		}else if(isPolindrome(temp2)) {
			return temp2;
		}else {
			temp1++;
			temp2--;
		}		
	  }		
		return 0;
	}
	
	public static boolean isPolindrome(int num) {
	   String s = String.valueOf(num);
	   int start = 0;
	   int end = s.length()-1;
		
	   while(start<end) {
		   if(s.charAt(start++) != s.charAt(end--))
			   return false;
	   }	   
		return true;
	}
}
