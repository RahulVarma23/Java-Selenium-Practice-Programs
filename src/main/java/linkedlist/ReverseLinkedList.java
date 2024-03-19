package linkedlist;

import java.util.LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(100);
		l1.add(200);
		l1.add(300);
		
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		l1.descendingIterator().forEachRemaining(l2::add);
		
		System.out.println(l2);
	}
}
