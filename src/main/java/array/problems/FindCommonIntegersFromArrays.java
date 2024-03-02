package array.problems;

public class FindCommonIntegersFromArrays {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        System.out.println("Common elements: ");
        findCommon(array1, array2);
    }

    //array should be sorted in order to use this two pointer approach
    private static void findCommon(int[] array1, int[] array2) {
        int i=0;
        int j=0;

        while(i<array1.length && j<array2.length) {

            if(array1[i]<array2[j]) {
                i++;
            }else if(array1[i]>array2[j]) {
                j++;
            }else{
                System.out.println(array1[i]);
                i++;
                j++;
            }
        }
    }
}
