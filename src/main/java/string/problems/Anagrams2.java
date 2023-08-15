package string.problems;

public class Anagrams2 {
	
	public static void main(String[] args) {
		System.out.println(areAnagrams("eat","tea"));
	}

	private static boolean areAnagrams(String str1, String str2) {
		
		if(str1.length() != str2.length()) 
			return false;
		
		int [] arr = new int [127];
		
		for (int i=0;i<str1.length();i++) {
			arr[str1.charAt(i)] ++;
		}
		
		for (int i=0;i<str2.length();i++) {
			arr[str2.charAt(i)]--;
		}
		
		for( int a : arr)
			if(a>0 || a<0)
				return false;	
		return true;	
	}
}
