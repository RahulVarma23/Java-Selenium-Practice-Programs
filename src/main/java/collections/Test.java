package collections;

import java.util.*;


public class Test {



	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2,5,1,3,9,10);

		//normal for loop
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}

		//advanced for loop

//		for(int i : list) {
//			System.out.println(i);
//		}
//
		//iterator

		Iterator<Integer> itr = list.iterator();

		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}

	}
}
