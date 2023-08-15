package interview.problems;

public class CountOfSubStrings {
	
	static int findCountOfSubStrings(String s){
		int f[]= new int[26];
		for (int i=0;i<s.length();i++) {
			f[s.charAt(i) - 'a'] = f[s.charAt(i) - 'a']+1;
		}
		int total_sum=0;
		 for(int j=0;j<f.length;j++) {
			 if(f[j]>1)
			total_sum= total_sum+f[j]+1;
			 else total_sum+= f[j];
			 
		 }
		 return (total_sum);
	}

	public static void main(String[] args) {	
		System.out.println(findCountOfSubStrings("abba"));
	}
}
