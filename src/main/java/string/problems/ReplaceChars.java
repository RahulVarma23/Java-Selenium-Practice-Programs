package string.problems;

public class ReplaceChars {


    //replace first occurance of 'o' with $ and next with $$ ans so on
    public static void main(String[] args) {
        String s = "aoirnfojfkomo";
        String result="";
        int occurrenceCount = 0;

        for (char c : s.toCharArray()) {
            if (c == 'o') {
               result+="$".repeat(++occurrenceCount);
            } else {
               result+=c;
            }
        }

        System.out.println(result);



    }
}
