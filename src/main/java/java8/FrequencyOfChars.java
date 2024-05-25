package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfChars {

    public static void main(String[] args) {
        String s = "electrical";

        List<Character> list = new ArrayList<>();
        for(char c: s.toCharArray()){
            list.add(c);
        }

       Map<Character, Long> map= list.stream().collect(Collectors.groupingBy(ch-> ch, Collectors.counting()));
        System.out.println(map);
    }
}
