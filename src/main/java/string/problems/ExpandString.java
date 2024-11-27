package string.problems;

public class ExpandString {

    //Input: a2b3c4d  output: aabbbccccd
    public static void main(String[] args) {
        String s = "a2b3c4d1";

        String output = returnExpandedString(s);
        System.out.println(output);
    }

    private static String returnExpandedString(String input) {
        int length = input.length();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<length;) {
            char currentChar = input.charAt(i);
            i++;

            StringBuilder numberBuilder = new StringBuilder();

            while(i<length && Character.isDigit(input.charAt(i))) {
                numberBuilder.append(input.charAt(i));
                i++;
            }

            int count = Integer.parseInt('0'+numberBuilder.toString());

            for(int j=0;j<count;j++) {
                sb.append(currentChar);
            }
        }
        return sb.toString();
    }
}
