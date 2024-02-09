package interview3;

import java.util.LinkedList;
import java.util.List;

public class ReverseCharsInTwoLinkedList {

    public static void main(String[] args) {
        List<Character> list1 = new LinkedList<>();

        list1.add('a');
        list1.add('b');
        list1.add('c');

        List<Character> list2 = new LinkedList<>();
        list2.add('c');
        list2.add('d');
        list2.add('e');

        String output = reverseAndConcat(list1) + reverseAndConcat(list2);

        System.out.println(output);

        String finalOutput = new StringBuilder(output).reverse().toString();
        System.out.println(finalOutput);

    }

    public static String reverseAndConcat(List<Character> list) {
        StringBuilder stringBuilder = new StringBuilder();

        list.stream().forEach(stringBuilder::append);

        return stringBuilder.reverse().toString();
    }
}
