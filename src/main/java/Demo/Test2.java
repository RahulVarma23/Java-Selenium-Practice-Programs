package Demo;

import java.util.HashSet;
import java.util.Set;

public class Test2 extends Test1 {
	
	public static void main(String[] args) {


		Integer [] arr = {1,2,3,3,4,5,5,5};

		Set<Integer> set = new HashSet<>();


		for(int num: arr) {
			if(set.add(num) ==false) {
				System.out.println(num);
			}
		}
	}
}
