package string.problems;

public class Pangram {

    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
       boolean ans = isPangram1(s);
        System.out.println(ans);
    }

    private static boolean isPangram(String s) {
        if(s.replaceAll("\\s+", "").length()<26){
            return false;
        }else {
            for(char i='a';i<='z';i++) {
                if(s.indexOf(i)<0){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isPangram1(String s) {
        int [] arr = new int[26];
        char [] chars = s.replaceAll("\\s+", "").toLowerCase().toCharArray();
        if(s.length()<26){
            return false;
        }else {
            for(char ch : chars) {
                arr[ch-'a']++;
            }
        }

        for(int a : arr) {
            if(a==0) {
                return false;
            }
        }
        return true;
    }
}
