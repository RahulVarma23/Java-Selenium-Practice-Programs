
package array.problems;

import java.util.*;

public class TwoSum {

	public static void main(String[] args) {
		int [] nums = {2,7,11,15,5,2,6,1,3};
           twoSum(nums, 9);
	}
	
	public static void twoSum(int [] nums, int target) {
		Map<Integer, Integer> map;
		map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				System.out.println("[" + map.get(complement) + "," + i + "]");
			}
			map.put(nums[i], i);
		}
	}
}
