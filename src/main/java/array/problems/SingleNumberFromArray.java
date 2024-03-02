package array.problems;

public class SingleNumberFromArray {

    public static void main(String[] args) {
        int [] arr = {0,1,1,0,2,2,4};

        int result =0;

        for(int i=0;i<arr.length;i++ ) {
            int num = arr[i];
            result^=num;
        }
        System.out.println(result);
    }
}
