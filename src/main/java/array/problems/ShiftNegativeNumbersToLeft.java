package array.problems;

import java.util.Arrays;

public class ShiftNegativeNumbersToLeft {

    static int [] shiftNegativeToLeft (int [] arr) {
        int [] ans = new int[arr.length];
        int count = arr.length-1;
        for(int i=count;i>=0;i--) {
            if(arr[i]>0) {
                ans[count--]=arr[i];
            }
        }
        count=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] <0) {
                ans[count++]=arr[i];
            }
        }
        return ans;
    }

    static int [] shiftNegativeToLeft1 (int [] arr) {
        int j = 0; // Pointer to track the position to place the next negative number
        for(int i=0;i<arr.length;i++) {

            if(arr[i]<0 ) {
                if(i!=j) { //swap only if i and j are not same
                    int temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = {1,-1,3,-2,-3,5,6,-7};

        int [] ans = shiftNegativeToLeft1(arr);
        System.out.println(Arrays.toString(ans));
    }
}
