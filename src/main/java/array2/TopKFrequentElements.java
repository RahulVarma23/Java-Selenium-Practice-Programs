package array2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TopKFrequentElements {

    public static void main(String[] args) {
        int [] nums = {1,2,2,3,3,3,4,4,4,4,4};

        System.out.println(Arrays.toString(topKFrequent(nums, 3)));
    }

    private  static int [] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        return map.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
