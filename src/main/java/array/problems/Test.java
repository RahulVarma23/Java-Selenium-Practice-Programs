package array.problems;

public class Test {	
   public static void main(String[] args) {
	   printNums(1);
   }
	 
	 static void printNums (int num) {
		 if(num<=100) {
			 System.out.print(num+" ");
			 printNums(num+1);
		 }
	 }
}
