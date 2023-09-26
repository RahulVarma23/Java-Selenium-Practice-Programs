package array.problems;

public class InsertDigit {

	public static void main(String[] args) {
		int [] array = {3,5,6,4,5,2,5};		
		int count =0;		
		for (int i=0;i<array.length;i++) {
			if (array[i]==5) {
				count++;
			}
		}
		int n= array.length+count;
		int [] arr = new int [n];
		int j=0;
		for (int k : array) {
			if (k == 5) {
				arr[j] = k;
				j = j + 2;
			} else {
				arr[j] = k;
				j++;
			}
		}	
		for (int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}