package interview.problems;

public class PalindromeNumber {

	public static boolean isPalindrome(int num) {

		String str = String.valueOf(num);
		int start = 0;
		int end = str.length() - 1;

		while (start < end) {
			if (str.charAt(start++) == str.charAt(end--)) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
	}

}
