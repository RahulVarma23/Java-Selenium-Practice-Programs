package BinarySearch;

public class Test {

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(findPosition(nums, 5));
    }

    private static int findPosition(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        if(nums.length==1 && nums[0]!=target) {
            return -1;
        }

        while (start <= end) {
            int mid = (start + end) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
