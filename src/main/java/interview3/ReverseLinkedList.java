package interview3;

import java.util.LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(100);
		ll.add(200);
		ll.add(300);
		
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		ll.descendingIterator().forEachRemaining(l1::add);
		
		System.out.println(l1);
	}
}
