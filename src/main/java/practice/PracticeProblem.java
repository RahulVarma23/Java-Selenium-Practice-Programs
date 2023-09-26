package practice;

public class PracticeProblem {

    public static void printNumbers(int start , int end) {
        System.out.println(start);
        start++;
        if(start<=end){
            printNumbers(start, end);
        }
    }

    public static void main(String[] args) {
        printNumbers(1, 100);
    }
}
