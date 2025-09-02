package array1;

public class MaxAndSecondMax {
	
	 static int findMax(int [] array){
		 if(array==null) {
			 return 0;
		 }
		 
		 if(array.length==1) {
			 return array[0];
		 }
		 int max =array[0],secondMax=array[0];	 
		 for (int i=0;i<array.length;i++) {
			 if(array[i]>max) {
				 secondMax= max;
				 max=array[i];			 
			 }else if(array[i]>secondMax) {
				 secondMax=array[i];		 
			 }
		 }
	 return secondMax;
	}

	public static void main(String[] args) {
		int [] a = {1,2,8,21,2,4,18,20};
		System.out.println(findMax(a));
	}
}