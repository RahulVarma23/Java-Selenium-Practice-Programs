package string.problems;

import java.util.*;

public class EncodeDecode {
   public static void main(String[] args) {
	   List<String> s = Arrays.asList("neet","code","love","you");

       String encoded = (encode(s));
       System.out.println(encoded);

       List<String> decoded = (decode(encoded));
       System.out.println(decoded);
   }

    public static List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int delimiter = s.indexOf('#', i);
            int length = Integer.parseInt(s.substring(i, delimiter));
            int start = delimiter + 1;
            int end = start + length;
            result.add(s.substring(start, end));
            i = end;
        }
        return result;
    }

    public static String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String s : strs) {
            sb.append(s.length()).append("#").append(s);

        }
        return sb.toString();
    }
}
