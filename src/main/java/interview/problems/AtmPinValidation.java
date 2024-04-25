package interview.problems;

public class  AtmPinValidation {

	public static void main(String[] args) {
		String str = "9543";
		int i=1,k=1;
		if (str.matches("[0-9]{4}")) {		
			for (int j=1;j<4;j++) {
				if(str.charAt(j-1)<str.charAt(j)) {
					i++;
				}else if(str.charAt(j-1)>str.charAt(j)) {
				    k++;
				}
			}
			if(i==4 || k==4) {
				System.out.println("Valid pin");
			}else {
				System.out.println("Invalid pin");
			}
		}
		else {
			System.out.println("Invalid pin");
		}
	}
}
