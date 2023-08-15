package latest;

public class SquareRoot {

	public static void main(String[] args) {
         System.out.println(mySquareRoot(50));
	}

	private static int mySquareRoot(int x) {
		int root =0;
		
		for(int i=0;i<=x ; i++) {		
			if(i*i==x || (i+1)*(i+1)>x) {
				root = i;
				break;
			}else {
				continue;
			}		
		}	
		return Math.toIntExact(root);
	}

}
