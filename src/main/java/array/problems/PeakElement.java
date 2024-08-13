package array.problems;

/*
{5,10,20,15}
The element 20 has neighbours 10 and 15 , both of them are less than 20.
{10,20,30,40,50}
50 is the peak element
 */

public class PeakElement {

    public static void main(String[] args) {
        int arr [] = {5,10,20,15};
        int arr1 [] = {10,20,30,40,50};
        System.out.println(findPeak(arr));
    }

    public static int findPeak(int [] arr) {
        int n = arr.length;
        if(n==1) return arr[0];

        //check first element
        if(arr[0]>arr[1]) return arr[0];

        //check last element
        if(arr[n-1]>arr[n-2]) return arr[n-1];

        //check middle element
        for(int i=1;i<n-1;i++) {
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
                return arr[i];
            }
        }
        return -1;
    }
}
