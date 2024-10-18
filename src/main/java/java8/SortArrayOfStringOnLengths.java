package java8;

import java.util.*;


public class SortArrayOfStringOnLengths {

    public static void main(String[] args) {
        String [] arr = {"fjjffj", "apple", "banana", "watermelon"};


        System.out.println(sortBasedOnLengthOfString(arr));

        System.out.println(sortBasedOnLengthOfStringUsingCustomMethod(arr));
    }

     static List<String> sortBasedOnLengthOfString(String [] arr) {
        List<java.lang.String> list = new ArrayList<>(Arrays.asList(arr));

        list.sort(Comparator.comparing(String::length));

        return list;
    }

    static List<String> sortBasedOnLengthOfStringUsingCustomMethod(String [] arr) {
        int length =arr.length;

        for(int i=0;i<length-2;i++ ) {

            for(int j= i+1;j<length-1;j++) {

                if(arr[i].length()>arr[j].length()) {
                    String temp=arr[i];
                    arr[i]=arr[j];
                    arr[j] =temp;
                }
            }
        }


        return new ArrayList<>(Arrays.asList(arr));
    }
}
