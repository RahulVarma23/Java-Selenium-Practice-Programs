package array.problems;

import java.util.HashSet;
import java.util.Set;

public class Test {
   public static void main(String[] args) {
	   int[] input = {100,4,200,1,3,2,5};

	   int maxStreak = 0;
	   int currentStreak = 0;
	   Set<Integer> set =  new HashSet<>();

	   for(int num : input) {
		   set.add(num);
	   }

	   for(int num: set){
		   if(!set.contains(num-1)) {
			   currentStreak = 1;

			   while (set.contains(num + 1)) {
				   num++;
				   currentStreak++;
			   }
		   }
		   maxStreak = Math.max(currentStreak, maxStreak);
	   }
	   System.out.println(maxStreak);
   }
}
