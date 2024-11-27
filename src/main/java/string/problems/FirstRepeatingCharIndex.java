package string.problems;

public class FirstRepeatingCharIndex {

    public static void main(String[] args) {
        int ans = findIndexOfFirstRepeatingChar1("loveleetcode");
        System.out.println(ans);
    }

    private static int findIndexOfFirstRepeatingChar(String str) {
        for(char ch: str.toCharArray()) {
            if(str.indexOf(ch)==str.lastIndexOf(ch)){
                return str.indexOf(ch);
            }
        }
        return -1;
    }

    private static int findIndexOfFirstRepeatingChar1(String str) {
        int [] arr = new int[26];
        for(char ch: str.toCharArray()) {
            arr[ch-'a']++;
        }
        for(int i=0;i<str.length();i++) {
            if(arr[str.charAt(i)-'a']==1) {
                return i;
            }
        }
        return -1;
    }
}
