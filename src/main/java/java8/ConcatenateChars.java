package java8;

import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateChars {

	public static void main(String[] args) {
		
		Character [] ch = {'o' ,'m','a','n'};
		
		//Stream.iterate(0, n->n+1).limit(ch.length-1).map(c-> (result+=c)).toString();
		
		List<Character> list = List.of(ch);
		
		String ans = list.stream().map(Object::toString).collect(Collectors.joining());
		
		System.out.println(ans);
	}
}
