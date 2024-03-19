package stringoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UncommonWords {

    public static void main(String[] args) {
        String s1 = "the tortoise beat the haire";
        String s2 = "the tortoise lost to the haire";
        //["beat", "to", "lost"]

        String s11 [] =  s1.split(" ");
        String s22 [] = s2.split(" ");

        List<String> l1 = new ArrayList<>(Arrays.asList(s11));
        List<String> l2 = new ArrayList<>(Arrays.asList(s22));
        List<String> l3 = new ArrayList<>();
        l3.addAll(l1);
        l3.addAll(l2);

        System.out.println(l3);

        l1.retainAll(l2);
        System.out.println(l1);

        l3.removeAll(l1);
        System.out.println(l3);
    }
}
