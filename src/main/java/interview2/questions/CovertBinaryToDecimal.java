package interview2.questions;

public class CovertBinaryToDecimal {

	public static void main(String[] args) {
		String binaryString = "1111111";
		int decimal = Integer.parseInt(binaryString,2);
		System.out.println(decimal);
		
		System.out.println(getDecimal(Integer.parseInt(binaryString)));		
	}
	
	public static double getDecimal(int binary) {
		double decimal =0;
		int n =0;
		
		while (binary !=0) {
			int temp = binary%10;
			binary = binary /10;
			decimal = decimal + temp*Math.pow(2, n);
			n++;
		}
		return decimal;
	}
}
