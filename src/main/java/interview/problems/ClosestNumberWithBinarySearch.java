package interview.problems;


public class ClosestNumberWithBinarySearch {
	int binarySearch(int [] a ,int l ,int r ,int num ,int minDiff,int index) {		
		if(l<=r) {	
			int mid = (l+r)/2;			
			int diff= Math.abs(a[mid]-num);
			if(minDiff>=diff) {
				minDiff=diff;
				index=mid;
			}	
			if(l==r) {
				return index;
			}
			else if(a[mid]<num) {
				return binarySearch(a,mid+1,r,num,minDiff,index);
			}
			else {
				return binarySearch(a,l,mid,num,minDiff,index);
			}
		}		
		return -1;
	}

	public static void main(String[] args) {
	int [] input = {1,2,3,4,5,8,13,21,34,55,89,144};
	int r = input.length-1;
	int index=-1;
	ClosestNumberWithBinarySearch c = new ClosestNumberWithBinarySearch();
	int result =c.binarySearch(input, 0, r, 10, Integer.MAX_VALUE,index);
	System.out.println(input[result]);
	}
}
