package scalar.sorting;

import java.util.Arrays;

public class MergeTwoSortedArrays {
	
	public static void main(String[] args) {
		int a [] = {1,2,4};
		int b [] = {2,3,5,6,8,9};
		
		System.out.println(Arrays.toString(mergeSortedArrays(a,b)));
	}

	private static int[]  mergeSortedArrays(int[] a, int[] b) {
		int ans [] = new int[a.length+b.length];
		int i=0;int j=0;
		int k=0;
		
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				ans[k]=a[i];
				i++;
				k++;	
			}
			else {
				ans[k]=b[j];
				j++;
				k++;
			}
		}
		while(i<a.length) {
			ans[k]=a[i];
			i++;
			k++;
		}
		while(j<b.length) {
			ans[k]=b[j];
			j++;
			k++;
		}
		return ans;
	}
}
