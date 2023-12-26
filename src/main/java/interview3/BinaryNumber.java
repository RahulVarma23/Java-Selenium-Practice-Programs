package interview3;

import java.util.Arrays;

public class BinaryNumber {

    public static void main(String[] args) {
        int a = 11010110;
        System.out.println(isBinary(a));
    }

    public static boolean isBinary(int num) {
        while(num !=0) {
             if(num%10 >1){
                 return false;
             }
             num = num/10;
        }
        return true;
    }

    public static boolean isBinaryNum(int num) {

       String numberString  =  Integer.toString(num);

       int [] array;
        array = Arrays.stream(numberString.split(""))
                .mapToInt(Integer::parseInt).toArray();
        int count=0;
        for(int a : array) {
            if(a == 0 || a==1){
                count ++;
            }
       }
        return count == array.length;
    }
}
