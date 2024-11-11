package string.problems;

public class FirstAndLastOccuranceOfCharacter {

    public static void main(String[] args) {
        String s = "amazonaanazzz";
        char target = 'a';

        int firstIndex = s.indexOf(target);

        int lastIndex = s.lastIndexOf(target);

        System.out.println("first  Index: "+firstIndex);
        System.out.println("last  Index: "+lastIndex);

    }
}
