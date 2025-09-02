package array1;

public class MonotonicArray {

    //array should be in ascending or descending order

    public static void main(String[] args) {
        int [] arr = {4,3,2,1};
        System.out.println(isArrayMonotonic(arr));
    }

    private static boolean isArrayMonotonic(int[] arr) {

        boolean increasing = true;
        boolean decreasing = true;

        for(int i=0;i<arr.length-1;i++) {
            if(arr[i]<arr[i+1]) {
                decreasing=false;
            }else if(arr[i]>arr[i+1]) {
                increasing=false;
            }
        }
        return increasing || decreasing;
    }
}
