package array.problems;

import java.util.Arrays;

public class DeleteElementFromArray {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7};

        int [] ans = new int[arr.length-1];


        int j=0;

        for(int i=0;i< arr.length;i++) {
            if(i!=2){
                ans[j] = arr[i];
                j++;
            }

        }

        System.out.println(Arrays.toString(ans));
    }
}
