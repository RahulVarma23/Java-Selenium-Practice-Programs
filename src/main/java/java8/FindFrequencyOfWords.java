package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFrequencyOfWords {

    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "banana", "orange", "apple","orange","orange", "banana");

        Map<String, Long> map = words.stream()
                .collect(Collectors.groupingBy(word->word,Collectors.counting()));

        System.out.println(map);
    }
}
