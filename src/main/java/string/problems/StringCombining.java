package string.problems;
/* Question 15: Write a java program to combine alternative character of a given string.
Input: String str1 = “Automation”; String str2 = “Testing”;
Output: ATuetsotmiantgion
 */
public class StringCombining {

    public static void main(String[] args) {
        String str1 = "Automation";
        String str2 = "Testing";
        StringBuffer output =new StringBuffer();

        int len = str1.length()+str2.length();
        for(int i=0;i<len;i++) {
            if(i< str1.length()) {
                output.append(str1.charAt(i));
            }
            if(i< str2.length()) {
                output.append(str2.charAt(i));
            }
        }
        System.out.println(output);
    }
}
