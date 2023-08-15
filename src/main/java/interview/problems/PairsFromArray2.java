package interview.problems;

import java.util.HashSet;

public class PairsFromArray2 {

	public static void main(String[] args) {
		int a [] = {3,0,2,1,3};;

		int sum = 3;
		
		HashSet <Integer> set = new HashSet<Integer> ();
		
		for (int i=0;i<a.length;i++) {
			set.add(a[i]);
			int temp = sum - a[i];
			
			if(set.contains(temp)) {
				System.out.println("("+temp+","+a[i]+")");
			}
			
		}		
	}
}
