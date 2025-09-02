package array1;

public class ProductArrayExceptSelf {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6};

        System.out.println("Original Array:");
        printArray(arr);

        int[] result = getProductArrayExceptSelf1(arr);

        System.out.println("\nProduct Array Except Self:");
        printArray(result);
    }

    private static int[] getProductArrayExceptSelf(int[] arr) {
        int n = arr.length;

        // Create arrays to store products from left and right
        int[] leftProducts = new int[n];
        int[] rightProducts = new int[n];

        // Initialize leftProducts and rightProducts arrays
        leftProducts[0] = 1;
        rightProducts[n - 1] = 1;

        // Calculate left products
        for (int i = 1; i < n; i++) {
            leftProducts[i] = leftProducts[i - 1] * arr[i - 1];
        }

        // Calculate right products
        for (int i = n - 2; i >= 0; i--) {
            rightProducts[i] = rightProducts[i + 1] * arr[i + 1];
        }

        // Calculate the final product array
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = leftProducts[i] * rightProducts[i];
        }

        return result;
    }

    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static int[] getProductArrayExceptSelf1(int[] arr) {
        int [] ans = new int[arr.length];

        for(int i=0;i<arr.length;i++) {
            int product = 1;

            for(int j=0;j<arr.length;j++) {
                if(i!=j) {
                    product = product*arr[j];
                }
            }

            ans[i] = product;

        }
        return ans;
    }
}
