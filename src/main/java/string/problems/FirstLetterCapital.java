package string.problems;

public class FirstLetterCapital {

	public static void main(String[] args) {		
		String str = "i love my india";
		String arr [] =str.split(" ");
		
		String output="";
					
		for(int i =0;i<arr.length;i++) {
			output =arr[i].substring(0,1).toUpperCase()+arr[i].substring(1);
			System.out.print(output+" ");
		}
	}
}
