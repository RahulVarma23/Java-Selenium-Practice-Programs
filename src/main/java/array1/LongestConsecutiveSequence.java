package array1;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
       int input [] = {100,4,200,1,3,2};
       System.out.println(lengthOfLongestConsecutiveElementSequence(input));   
    }

    private static int lengthOfLongestConsecutiveElementSequence(int [] nums) {
       int maxStreak=0;
       Set<Integer> set = new HashSet<>();

       for(int num : nums){
           set.add(num);
       }
      
       for(int num :set ){
           if(!set.contains(num-1)){
               int currentStreak =1;

               while(set.contains(num+1)){
                   num++;
                   currentStreak++;
               }
               maxStreak= Math.max(maxStreak,currentStreak);
           }
       }
        return maxStreak;
    }
}