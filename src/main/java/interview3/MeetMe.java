package interview3;

import java.util.List;

public class MeetMe {
	public static void main(String[] args) {	
		List<String> words = List.of("meet","meet-me","implement","mango");
		int count=0;	
		for (String word: words) {	
			if(word.indexOf("me")==-1) {
				System.out.print(word+",");
			}
			while(word.indexOf("me") !=-1) {
				word=word.replaceFirst("me", "");
				count++;
			}			
		}	
		System.out.println(count);
	}
}
