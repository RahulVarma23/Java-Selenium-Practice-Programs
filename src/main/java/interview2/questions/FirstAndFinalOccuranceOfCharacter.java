package interview2.questions;

public class FirstAndFinalOccuranceOfCharacter {

	public static void main(String[] args) {
		int[] list = {1,2,3,4,5,5,7,8,5};
        findFirstAndFinalOccuranceOfInteger(list);
	}

	private static void findFirstAndFinalOccuranceOfInteger(int[] list) {
		for(int i =0;i<list.length;i++) {
			for(int j=i+1;j<list.length;j++) {
				if(list[i]==list[j])
					System.out.println(i+" and "+j);
			}
		}
	}
}
