package interview.problems;

public class MaximumNumbersInSequence {

	public static void main(String[] args) {
		String s = "10002123111120111";
		int count =0;
		int maxCount = 0;
		
		for (int i=0;i<s.length();i++) {
			if (s.charAt(i)=='1') {
				count++;
				maxCount = Math.max(maxCount, count);
			}else {
				count =0;
				continue;
			}
		}		
		System.out.println(maxCount);
	}
}