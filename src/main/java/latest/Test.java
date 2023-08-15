package latest;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Integer[] num = {1,2,3,4};
		
		List <Integer> al = Arrays.asList(num);
	
		System.out.println(al);

		al.add(5);
		al.add(null);
		System.out.println(al);
		
		Collections.addAll(al ,num);
		System.out.println(al);
		
		HashSet <Integer>hs = new HashSet <Integer>(al);
		
		System.out.println(hs);
		hs.add(null);
	}
}
