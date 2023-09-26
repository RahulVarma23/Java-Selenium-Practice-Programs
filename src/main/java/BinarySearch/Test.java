package BinarySearch;

public class Test {

    public static void main(String[] args) {
        int nums [] = {1,2,3,3,3,3};
        System.out.println(searchElement(nums, 3, false));
    }

    private static int searchElement(int[] nums, int target , boolean firstIndex) {
        int left =0;
        int right = nums.length-1;
        int res = -1;

        while(left<=right){
            int mid = (left+right)/2;
            if(target<nums[mid]){
                right = mid-1;
            }else if(target>nums[mid]){
                left =mid+1;
            }else{
                res = mid;
                if(firstIndex) {
                    right = mid - 1;
                }else{
                    left = mid+1;
                }
            }
        }
        return res;
    }
}
