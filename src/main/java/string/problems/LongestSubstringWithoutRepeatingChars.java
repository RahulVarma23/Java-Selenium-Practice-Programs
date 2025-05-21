package string.problems;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingChars {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb")); //abc -> 3
        System.out.println(lengthOfLongestSubstring("pwwkew")); //kew
        System.out.println(lengthOfLongestSubstring("bbbb")); //b
        System.out.println(longestSubstringWithoutRepeatingChar("abcabcbb"));
    }

    private static int lengthOfLongestSubstring(String str) {
        int left =0;
        int right =0;
        int maxLength = 0;

        HashSet<Character> hs = new HashSet<>();

        while(right<str.length()) {
            char ch = str.charAt(right);
            if(!hs.contains(ch)) {
                hs.add(ch);
                right++;
            }else {
                hs.remove(str.charAt(left));
                left++;
            }
            maxLength = Math.max(maxLength, hs.size());
        }
        return maxLength;
    }

    private static String longestSubstringWithoutRepeatingChar(String str) {
        int left =0;
        int right =0;
        int maxLength = 0;
        int maxStart = 0;

        HashSet<Character> hs = new HashSet<>();

        while(right<str.length()) {
            char ch = str.charAt(right);
            if(!hs.contains(ch)) {
                hs.add(ch);
                right++;

                if(hs.size()>maxLength) {
                    maxLength=hs.size();
                    maxStart=left;
                }


            }else {
                hs.remove(str.charAt(left));
                left++;

            }

        }
        return str.substring(maxStart, maxLength+maxStart);
    }
}
