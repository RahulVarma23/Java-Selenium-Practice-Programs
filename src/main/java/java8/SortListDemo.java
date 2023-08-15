package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(8);
		list.add(12);
		list.add(13);
		list.add(4);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		list.stream().sorted().forEach(x->System.out.print(x+" "));
		System.out.println();
		list.stream().sorted(Comparator.reverseOrder()).forEach(x->System.out.print(x+" "));
	}
}
