package stringoperations;

public class RemoveSpecialChars {

    public static void main(String[] args) {
        String s = "lee$^t*#code";

        System.out.println(s.replaceAll("[^a-z,0-9,A-Z]", ""));
        System.out.println(s.replaceAll("[a-z,0-9,A-Z]", ""));
    }
}
