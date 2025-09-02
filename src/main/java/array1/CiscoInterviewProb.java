package array1;

public class CiscoInterviewProb {
	/*1  0  6
	3  7  2
	2  6  4 */

	public static void main(String[] args) {	
		int a [] [] = {{1,0,6},{3,7,2},{2,6,4},{2,9,1}};
		int min = a [0][0];
		
		int col=0;

		for(int i = 0 ;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(a[i][j]<min) {
					min=a[i][j];
					col=j;
				}
			}
		}
		int max =0;

		for(int k =0 ; k<a.length;k++) {
			if(a[k][col]>max) {
				max=a[k][col];
			}
		}
		System.out.println("minimum value: "+min);
		System.out.println("max value in same column: "+max);
	}
}
