package practice;

public class Test {

	public static void main(String[] args) {
		String s = "My name is Rahul";	
		String [] s1 = s.split(" ");
				
		for(int i=0;i<s1.length;i++) {
			String rev ="";
			char [] charArray = s1[i].toCharArray();
			for(int j=charArray.length-1;j>=0;j--) {
				rev +=charArray[j];
			}
			System.out.print(rev+" ");
		}
	}
}
