package string.problems;

public class NumberOfChangingKeys {

    public static void main(String[] args) {
        String s = "abBcCdD";

        char lastKey = Character.toLowerCase(s.charAt(0));
        int count = 0;

        for(int i=1;i<s.length();i++) {
            char currentKey = Character.toLowerCase(s.charAt(i));
            if(lastKey !=currentKey){
                count++;
            }
            lastKey=currentKey;
        }

        System.out.println(count);
    }
}
