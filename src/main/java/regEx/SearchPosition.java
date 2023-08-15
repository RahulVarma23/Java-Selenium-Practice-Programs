package regEx;

public class SearchPosition {
	
	public static int search(int [] a , int t) {
		int index=0;
		for(int n :a) {
			if(n>t) {
				return index;
			}else if(n==t) {
				return index;
			}
			
			index++;
		}
		
		return index;
		
	}

	public static void main(String[] args) {
		
		int [] input = {1,2,5,7,8};
		System.out.println(search(input,6));

	}

}
