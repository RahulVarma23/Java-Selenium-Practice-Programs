package interview.problems;

public class PatternPrinting1 {
	public static void main(String[] args) {
		for (int i=1;i<=4;i++) {
			for (int j=1;j<=i;j++) {
				if(j==1) {
					System.out.print("aA"+ " ");
				}else if(j==2) {
					System.out.print("bB"+ " ");
				}else if(j==3) {
					System.out.print("cC"+ " ");
				}else if(j==4) {
					System.out.print("dD" +" ");
				}
			}
			System.out.println();
		}
		for (int i=3;i>=1;i--) {
			for (int j=1;j<=i;j++) {
				if(j==1) {
					System.out.print("aA"+ " ");
				}else if(j==2) {
					System.out.print("bB"+ " ");
				}else if(j==3) {
					System.out.print("cC"+ " ");
				}else if(j==4) {
					System.out.print("dD" +" ");
				}
			}
			System.out.println();
		}

	}

}
