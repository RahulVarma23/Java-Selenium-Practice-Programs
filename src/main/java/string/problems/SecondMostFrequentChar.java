package string.problems;
public class SecondMostFrequentChar {

    public static void main(String[] args) {
       System.out.println(findSecondMostFrequentChar("banana"));
    }

    private static char findSecondMostFrequentChar(String a) {
        int [] array = new int[26];
        char [] arr = a.toCharArray();

        for (int i=0;i<arr.length;i++){
            int index = arr[i]-'a';
            array[index] = array[index]+1;
        }
        int max=0 ,secondMax =0;
        for (int j=0;j<array.length;j++){
            if(array[j] > max) {
                max = array[j];
            }
           else if(array[j]>secondMax && array[j]<max)
               secondMax= array[j];
           }

        char ch = Character.MIN_VALUE;
        for (int j=0;j<array.length;j++){
            if(array[j]==secondMax)
              ch = (char) (j+'a');
        }
        return ch;
    }
}
