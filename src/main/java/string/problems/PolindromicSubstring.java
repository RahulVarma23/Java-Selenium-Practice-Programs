package string.problems;

import java.util.HashSet;
import java.util.Set;

public class PolindromicSubstring {

    static int maxLength =0;

    //expand around center
    public static void isPolindrome(String str, int left, int right, Set<String> set) {
        while(left>=0 && right<str.length() && (str.charAt(left)==str.charAt(right))) {

            String subString = str.substring(left , right+1);

            if(subString.length()>maxLength){
                maxLength=subString.length();
            }

            set.add(subString);
            left--;
            right++;
        }
    }

    public static void generateAllPolindromicSubstring(String str) {
        Set<String> set = new HashSet<>();
        for(int i=0;i<str.length();i++) {
            isPolindrome(str,i, i, set); //odd length polindrom
            isPolindrome(str,i, i+1, set);//even length polindrom
        }

        System.out.println(set);
    }

    public static void main(String[] args) {
        generateAllPolindromicSubstring("google");
        System.out.println(maxLength);
    }
}
