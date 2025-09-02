package array2;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        int [] nums = {-1,0,1,2,-1,-4, 3, 4};
        System.out.println(threeSum(nums));
    }

    public static Set<List<Integer>> threeSum(int [] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;

        for(int i=0;i<n;i++) {
            int l = i+1, r = n-1;
            while(l<r) {
                int sum = nums[i]+nums[l]+nums[r];

                if(sum<5){
                    l++;
                }else if(sum>5) {
                    r--;
                }else{
                    ans.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                }
            }
        }
        return ans;
    }
}
