package interview.problems;

public class PairsFromArray {

	public static void main(String[] args) {
		int a [] = {2,1,3,4,-7,5,13,8,-2};
		int sum = 6;
		
		for (int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==sum) {
					System.out.println("("+a[i]+","+a[j]+")");
					break;
				}
			}
		}		
	}
}
