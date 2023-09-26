package array.problems;

public class PrintWordAfterThreeConsecutiveNumbers {
	
	public static void main(String[] args) {
		int [] a = {1,3,5,6,7,10,11,12,14};
		
//		for(int i =0;i<a.length-2;i++) {
//			for(int j=i+1;j<a.length-1;j++) {
//				for(int k=j+1;k<a.length;k++) {
//					if(a[k]-a[j]==1 && a[j]-a[i]==1) {
//						System.out.println("java");
//					}
//				}
//			}
//		}
		int j=1;
		int k=2;
		for(int i=0;i<a.length;i++) {			
			if(j<a.length&& k<a.length && a[j]-a[i]==1 && a[k]-a[j]==1)
				System.out.print("java"+" ");
			j++;
			k++;	
		}
	}
}
