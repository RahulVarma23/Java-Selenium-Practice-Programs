package string.problems;

public class GetAllUPLetters {
	
	public static void main(String[] args) {
		
		String name = "RaHul vARMa";
		
		for(int i=0; i<name.length();i++) {
			if(name.charAt(i)>=65 && name.charAt(i)<=90  ) {
				System.out.print(name.charAt(i)+" ");
			}
		}
	}
}
