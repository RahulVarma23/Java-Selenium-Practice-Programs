package interview.problems;

public class LongestPrefix {

	public static void main(String[] args) {
		String[]  str = {"flowers", "flight" , "flat"};
		System.out.println(findLongestPrefix(str));
	}

	private static String findLongestPrefix(String[] str) {
		String ans = str[0];		
		for (int i=0;i<str.length;i++) {
			while(!str[i].startsWith(ans)) {
				ans= ans.substring(0, ans.length()-1);
			}			
		}
		return ans;
	}
}
