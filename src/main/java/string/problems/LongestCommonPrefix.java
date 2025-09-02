package string.problems;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};

        System.out.println(longestCommonPrefix(strs1)); // "fl"
        System.out.println(longestCommonPrefix(strs2)); // ""
    }

    private static String longestCommonPrefix(String[] str) {
        if (str == null || str.length == 0) return "";
        String prefix = str[0];

        for(String s: str) {

            while(s.indexOf(prefix) !=0) {
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}
