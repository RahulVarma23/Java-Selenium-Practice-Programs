package java8;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintPrimeNumberInDescendingOrder {
	public static void main(String[] args) {
		System.out.println(printPrimeNumbers(50));
	}
	
	public static List<Integer> printPrimeNumbers(int limit){
		List <Integer> list = Stream.iterate(2, n->n+1).filter(PrintPrimeNumberInDescendingOrder::checkPrime).limit(50).collect(Collectors.toList());
		Collections.reverse(list);
		return list;
	}
	
	public static boolean checkPrime(int num) {	
		for(int i=2 ; i<=num/2; i++) {			
			if(num%i==0)
				return false;			
		}
		return true;	
	}
}
