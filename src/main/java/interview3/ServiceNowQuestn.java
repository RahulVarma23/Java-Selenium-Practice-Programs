package interview3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ServiceNowQuestn {


    public static void addIntegerOfArray(int[] arr){
//        StringBuilder num = new StringBuilder();
//
//        for(int i=0;i<arr.length;i++){
//            num.append(arr[i]);
//        }
       String sum =  Arrays.stream(arr).mapToObj(String::valueOf).collect(Collectors.joining());

        System.out.println(sum);

        int number=Integer.parseInt(sum)+arr[0];
        int[] c = Integer.toString(number).chars().map(Character::getNumericValue).toArray();
        System.out.println( "Output : "+Arrays.toString(c));

    }

    public static void main(String[] args) {
        int[] array={1,5,4};
        System.out.println("Input :"+Arrays.toString(array));
        ServiceNowQuestn.addIntegerOfArray(array);
    }
}
